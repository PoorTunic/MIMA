import { Component } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { IHotel } from "../../interfaces/IHotel";
import { HotelProvider } from '../../providers/hotel/hotel';
import { LoginProvider } from "../../providers/login/login"
import { MonumentListPage } from "../monument-list/monument-list";
import { IUser } from '../../interfaces/IUser';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  hotels: IHotel[] = new Array<IHotel>();

  nameHotel: string = "";

  user: IUser;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    public hotelProvider: HotelProvider,
    public loginProvider: LoginProvider) {
      this.user = navParams.get('user');
  }

  onSubmit() {
    this.loadHotels();
  }

  ionViewDidLoad() {
    console.log(this.user)
    this.loadHotels();
  }


  private loadHotels() {
    this.hotelProvider.getHotels(this.nameHotel).subscribe(data => {
      this.hotels = data;
    })
  }

  getMonumentList(IHotel) {
    this.navCtrl.push(MonumentListPage, IHotel);
  }

  searchHotel() {
    this.loadHotels();
  }
}
