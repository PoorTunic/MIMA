import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { MonumentListPage } from './monument-list';

@NgModule({
  declarations: [
    MonumentListPage,
  ],
  imports: [
    IonicPageModule.forChild(MonumentListPage),
  ],
})
export class MonumentListPageModule {}
