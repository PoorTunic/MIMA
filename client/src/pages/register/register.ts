import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController, Toast } from 'ionic-angular';
import { IUser } from '../../interfaces/IUser';
import { UserProvider } from '../../providers/user/user';
import { HomePage } from '../home/home';
import { LoginPage } from '../login/login';

/**
 * Generated class for the RegisterPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-register',
  templateUrl: 'register.html',
})
export class RegisterPage {

  username: string;
  pass: string;
  nom: string;
  prenom: string;
  email: string;

  status: string = "";
  constructor(public navCtrl: NavController, public navParams: NavParams, public userProvider: UserProvider, public toastCtrl: ToastController) {
  }

  ionViewDidLoad() {
  }

  inscrire() {
    let user: IUser = {
      username: this.username,
      password: this.pass,
      nom: this.nom,
      prenom: this.prenom,
      email: this.email
    };

    this.userProvider.inscrireUser(user).subscribe(data => {
      console.log(data)
      if (data.status == "ok") {
        this.navCtrl.setRoot(LoginPage)
        this.toast(data.msg);
      } else {
        this.toast(data.msg);
      }
    })
  }

  toHome() {
    this.navCtrl.setRoot(HomePage)
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
