import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarListarComponent } from './buscar-listar.component';

describe('BuscarListarComponent', () => {
  let component: BuscarListarComponent;
  let fixture: ComponentFixture<BuscarListarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuscarListarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuscarListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
