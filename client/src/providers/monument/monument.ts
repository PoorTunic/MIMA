import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Platform } from "ionic-angular";
import { Observable } from "rxjs/Rx";
import 'rxjs/add/operator/map';
import { IHotel } from "../../interfaces/IHotel";
import { IMonument } from "../../interfaces/IMonument";

@Injectable()
export class MonumentProvider {

  private baseUrl: string = "http://localhost:8080/monuments";

  constructor(public http: HttpClient, public plateform: Platform) {

  }

  getMonumentList(hotelData: IHotel): Observable<any> {
    return this.http.get(this.baseUrl + "?coor0=" + hotelData.location[0] + "&coor1=" + hotelData.location[1] + "&dist=2500");
  }

  saveMonuments(monuments: IMonument[]): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    headers.append("ContentType", "application/json;charset=UTF-8");
    return this.http.post("http://localhost:8080/user/save", monuments, { headers });
  }

  getMyMonumentList(): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    return this.http.get("http://localhost:8080/user/toVisit/", { headers });
  }

  deleteMonument(monument: IMonument): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    headers.append("ContentType", "application/json;charset=UTF-8");
    return this.http.post("http://localhost:8080/user/delete", monument, { headers });
  }

  visitedMonument(monument: IMonument): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    headers.append("ContentType", "application/json;charset=UTF-8");
    return this.http.post("http://localhost:8080/user/updateMonument", monument, { headers })
  }

  visitedMonuments(): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    headers.append("ContentType", "application/json;charset=UTF-8");
    return this.http.get("http://localhost:8080/user/visitedMonuments/", {headers});
  }
}