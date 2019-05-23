import { Injectable } from '@angular/core';

//imports nuevos
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Persona } from '../modelo/persona/persona';

//nuevo
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class PersonaServiciosService {

  //la clase entera es nueva

  constructor(private http:HttpClient) { }

  private personaUrl = 'http://localhost:8080/persona-portal/personas';
  
  public getPersonas(){
    return this.http.get<Persona[]>(this.personaUrl);
  }

  public createPersona(persona){
    return this.http.post<Persona>(this.personaUrl,persona);
  }

  public deletePersona(persona){
    return this.http.delete(this.personaUrl + "/"+persona.idpersona);
  }
  public detailPersona(persona){
    return this.http.get(this.personaUrl + "/"+persona.idpersona);
  };



}
