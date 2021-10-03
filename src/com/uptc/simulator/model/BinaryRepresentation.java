package com.uptc.simulator.model;

public class BinaryRepresentation {
  private String _representation;

  public BinaryRepresentation(int size) {
    _representation = new String(new char[size]).replace('\0', '0');
  }

  public void add() {
    char[] bits = _representation.toCharArray();
    boolean carry = true;
    int position = bits.length - 1;

    while (carry && position >= 0) {
      if (bits[position] == '0') {
        bits[position] = '1';
        carry = false;
      } else {
        bits[position] = '0';
      }
      position--;
    }

    _representation = String.valueOf(bits);
  }

  public void setRepresentation(String data) {
    if (data.length() == _representation.length()) {
      _representation = data;
    }
  }

  public String getValue() { return this._representation; }
}
