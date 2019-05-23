import { TestBed } from '@angular/core/testing';

import { PersonaServiciosService } from './persona-servicios.service';

describe('PersonaServiciosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PersonaServiciosService = TestBed.get(PersonaServiciosService);
    expect(service).toBeTruthy();
  });
});
