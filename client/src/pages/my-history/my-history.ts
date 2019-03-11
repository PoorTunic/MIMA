import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { MonumentProvider } from '../../providers/monument/monument';
import { IMonument } from '../../interfaces/IMonument';

/**
 * Generated class for the MyHistoryPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-my-history',
  templateUrl: 'my-history.html',
})
export class MyHistoryPage {

  visitedMonuments: IMonument[] = [];

  constructor(public navCtrl: NavController, public navParams: NavParams, public monumentProvider: MonumentProvider) {

  }


  ionViewWillEnter() {
    this.loadVisitedMonuments();
  }

  loadVisitedMonuments() {
    this.monumentProvider.visitedMonuments().subscribe(data => {
      this.visitedMonuments = data;
    })
  }

}
