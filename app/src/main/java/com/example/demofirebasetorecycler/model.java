package com.example.demofirebasetorecycler;

public class model
{
  String address,name,password;

  model()
  {

  }

    public model(String address, String name, String password) {
        this.address = address;
        this.name = name;
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
