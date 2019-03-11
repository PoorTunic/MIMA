import { Component, ViewChild } from '@angular/core';
import { Nav, Platform, Events } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { IUser } from "../interfaces/IUser";

import { HomePage } from '../pages/home/home';
import { MyListsPage } from '../pages/my-lists/my-lists';
import { RegisterPage } from '../pages/register/register';
import { LoginPage } from "../pages/login/login";
import { LoginProvider } from '../providers/login/login';
import { ProfilePage } from '../pages/profile/profile';
import { LogoutPage } from '../pages/logout/logout';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;

  rootPage: any = HomePage;

  pages: Array<{ title: string, component: any }>;

  constructor(public platform: Platform, public statusBar: StatusBar, public splashScreen: SplashScreen, events: Events) {
    this.initializeApp();

    // used for an example of ngFor and navigation
    this.pages = [
      { title: 'Mes monuments', component: MyListsPage },
      { title: 'Connexion', component: LoginPage },
      { title: 'S\'inscrire', component: RegisterPage }
    ];

    events.subscribe('user:loggedin', () => {
      this.pages = [
        { title: 'Mes monuments', component: MyListsPage },
        { title: 'Mon compte', component: ProfilePage },
        { title: 'Deconnexion', component: LogoutPage }
      ];
    });

    events.subscribe('user:loggedout', () => {
      this.pages = [
        { title: 'Mes monuments', component: MyListsPage },
        { title: 'Connexion', component: LoginPage },
        { title: 'S\'inscrire', component: RegisterPage }
      ];
    });
  }

  initializeApp() {
    this.platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }

  openPage(page) {
    // Reset the content nav to have just this page
    // we wouldn't want the back button to show in this scenario
    this.nav.setRoot(page.component);
  }
}
