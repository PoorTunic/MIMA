import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { IonicStorageModule } from '@ionic/storage';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { HotelProvider } from '../providers/hotel/hotel';
import { UserProvider } from '../providers/user/user';
import { MonumentProvider } from '../providers/monument/monument';
import { HttpClientModule } from '@angular/common/http';
import { MonumentListPageModule } from '../pages/monument-list/monument-list.module';
import { RegisterPageModule } from '../pages/register/register.module';
import { MyListsPageModule } from '../pages/my-lists/my-lists.module';
import { LoginPageModule } from '../pages/login/login.module';
import { ProfilePageModule } from '../pages/profile/profile.module';
import { LoginProvider } from '../providers/login/login';
import { MyHistoryPageModule } from '../pages/my-history/my-history.module';
import { LogoutPageModule } from '../pages/logout/logout.module';

@NgModule({
  declarations: [
    MyApp,
    HomePage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    HttpClientModule,
    MonumentListPageModule,
    RegisterPageModule,
    MyListsPageModule,
    LoginPageModule,
    LogoutPageModule,
    ProfilePageModule,
    MyHistoryPageModule,
    IonicStorageModule.forRoot({
      driverOrder : [
        'localstorage'
      ]
    })
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    { provide: ErrorHandler, useClass: IonicErrorHandler },
    HotelProvider,
    MonumentProvider,
    UserProvider,
    LoginProvider
  ]
})
export class AppModule { }
