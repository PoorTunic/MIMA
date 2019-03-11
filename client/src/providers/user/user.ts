import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IUser } from '../../interfaces/IUser';
import { Observable } from 'rxjs';

/*
  Generated class for the UserProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class UserProvider {

  private baseUrl: string = "http://localhost:8080/user/";

  constructor(public http: HttpClient) {

  }

  inscrireUser(user: IUser): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    return this.http.get(this.baseUrl +
      "register?username=" + user.username +
      "&password=" + user.password +
      "&nom=" + user.nom +
      "&prenom=" + user.prenom +
      "&email=" + user.email, { headers });
  }

  logIn(user: IUser): Observable<any> {
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*");
    return this.http.get(this.baseUrl +
      "login?username=" + user.username +
      "&password=" + user.password, { headers });
  }
}
