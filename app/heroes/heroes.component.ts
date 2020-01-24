import { Component, OnInit, Input, Output } from '@angular/core';
import { Hero } from '../hero';
import { HEROES } from '../mock-heroes';
import {EventEmitter} from '@angular/core'
@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {
  hero: Hero = {
    id: 1,
    name: 'Windstorm'
  };

  heroes = HEROES;
  @Input() messageFromParent:string;
  

  msg='Hello to parent';
  @Output() childMessage =new EventEmitter<string>();

  constructor() { }

  ngOnInit() {
    this.childMessage.emit(this.msg);


  }
}
