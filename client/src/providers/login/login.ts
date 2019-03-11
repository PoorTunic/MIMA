import { Injectable } from '@angular/core';
import { Storage } from "@ionic/storage";
import { IUser } from '../../interfaces/IUser';

/*
  Generated class for the LoginProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class LoginProvider {

  private userKey = "usr_";

  constructor(private storage: Storage) {
  }

  addUserInfo(user: IUser) {
    this.storage.set(this.getUserKey(user), user.password);
  }

  removeUser(user: IUser) {
    this.storage.remove(this.getUserKey(user));
  }

  getUserKey(user: IUser) {
    return this.userKey + user.username.toString();
  }

  getLocal(): number {
    let siz: number;
    this.storage.length().then(data => siz = data);
    return siz;
  }
}
