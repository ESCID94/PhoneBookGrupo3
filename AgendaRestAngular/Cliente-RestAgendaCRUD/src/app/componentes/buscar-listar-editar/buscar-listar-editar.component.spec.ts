import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuscarListarEditarComponent } from './buscar-listar-editar.component';

describe('BuscarListarComponent', () => {
  let component: BuscarListarEditarComponent;
  let fixture: ComponentFixture<BuscarListarEditarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuscarListarEditarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuscarListarEditarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
