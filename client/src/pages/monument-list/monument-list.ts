import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { MonumentProvider } from '../../providers/monument/monument';
import { IHotel } from "../../interfaces/IHotel";
import { IMonument } from '../../interfaces/IMonument';

/**
 * Generated class for the MonumentListPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-monument-list',
  templateUrl: 'monument-list.html',
})
export class MonumentListPage {

  hotelData: IHotel;

  monuments: IMonument[] = new Array<IMonument>();

  constructor(public navCtrl: NavController, public navParams: NavParams, public MonumentProvider: MonumentProvider, private toastCtrl: ToastController) {
    this.hotelData = navParams.data;
  }

  ionViewDidLoad() {
    this.MonumentProvider.getMonumentList(this.hotelData).subscribe(data => {
      this.monuments = data;
    });
  }

  saveList() {
    this.MonumentProvider.saveMonuments(this.monuments).subscribe(data => {
      if(data.status === "ok"){
        this.toast(data.msg);
      }
    });
  }

  toast(msg : string) {
    let toast = this.toastCtrl.create({
      message: msg,
      duration: 1000,
      position: 'top'
    });
  
    toast.onDidDismiss(() => {
    });
  
    toast.present();
  }
}
