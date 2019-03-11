import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, App, ToastController, Events } from 'ionic-angular';
import { UserProvider } from '../../providers/user/user';
import { IUser } from '../../interfaces/IUser';
import { LoginProvider } from '../../providers/login/login';
import { HomePage } from '../home/home';

/**
 * Generated class for the LoginPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-login',
  templateUrl: 'login.html',
})
export class LoginPage {

  username: string;
  pass: string;

  status: string;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    public userProvider: UserProvider,
    public loginProvider: LoginProvider,
    public app: App,
    public toastCtrl: ToastController,
    public events: Events) {

  }

  ionViewDidLoad() {

  }

  conexion() {
    let user: IUser = {
      username: this.username,
      password: this.pass,
      nom: '',
      prenom: '',
      email: ''
    };

    this.userProvider.logIn(user).subscribe(data => {
      if (data.status === "ok") {
        this.events.publish('user:loggedin');
        this.toHome(data.username);
        this.toast(data.msg);
      } else {
        this.toast(data.msg);
      }
    })
  }

  toHome(username: any) {
    this.navCtrl.setRoot(HomePage, {
      user: {
        username
      }
    });
  }

  toast(msg: string) {
    let toast = this.toastCtrl.create({
      message: msg,
      duration: 1500,
      position: 'top'
    });

    toast.onDidDismiss(() => {
    });

    toast.present();
  }
}
