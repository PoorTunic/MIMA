import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Platform } from "ionic-angular";
import { Observable } from "rxjs/Rx";
import 'rxjs/add/operator/map';

@Injectable()
export class HotelProvider {

  private baseUrl: string = "http://localhost:8080/hotels";

  constructor(public http: HttpClient, public plateform: Platform) {

  }

  getHotels(hotelNom: string): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    if (hotelNom == "") {
      return this.http.get(this.baseUrl + "?hotelName=", { headers });
    } else {
      return this.http.get(this.baseUrl + "?hotelName=" + hotelNom, { headers });
    }
  }
}
