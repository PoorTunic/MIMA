import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { IMonument } from "../../interfaces/IMonument";
import { MonumentProvider } from '../../providers/monument/monument';
import { HomePage} from "../home/home";
import { MyHistoryPage } from '../my-history/my-history';

/**
 * Generated class for the MyListsPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-my-lists',
  templateUrl: 'my-lists.html',
})
export class MyListsPage {

  mesMonuments: IMonument[] = [];

  constructor(public navCtrl: NavController, public navParams: NavParams, public monumentProvider: MonumentProvider, public toastCtrl: ToastController) {
  }

  ionViewWillEnter() {
    this.loadMyMonuments();
  }

  loadMyMonuments() {
    this.monumentProvider.getMyMonumentList().subscribe(data => {
      this.mesMonuments = data;
    })
  }

  deleteMonument(monument: IMonument) {
    this.monumentProvider.deleteMonument(monument).subscribe(data => {
      if(data.status === "ok"){
        this.toast(data.msg);
        this.loadMyMonuments();
      }
    })
  }

  visitedMonument(monument: IMonument) {
    this.monumentProvider.visitedMonument(monument).subscribe(data => {
      if(data.status === "ok"){
        this.toast(data.msg);
        this.loadMyMonuments();
      }
    })
  }

  toast(msg : string) {
    let toast = this.toastCtrl.create({
      message: msg,
      duration: 1500,
      position: 'top'
    });
  
    toast.onDidDismiss(() => {
    });
  
    toast.present();
  }

  toHome(){
    this.navCtrl.setRoot(HomePage);
  }

  toVisited(){
    this.navCtrl.push(MyHistoryPage);
  }
}
