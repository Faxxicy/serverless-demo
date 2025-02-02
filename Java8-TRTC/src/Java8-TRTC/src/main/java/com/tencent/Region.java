/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.tencent;

public class Region {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Region(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Region obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        trtcenginewarperJNI.delete_Region(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOffset_x(int value) {
    trtcenginewarperJNI.Region_offset_x_set(swigCPtr, this, value);
  }

  public int getOffset_x() {
    return trtcenginewarperJNI.Region_offset_x_get(swigCPtr, this);
  }

  public void setOffset_y(int value) {
    trtcenginewarperJNI.Region_offset_y_set(swigCPtr, this, value);
  }

  public int getOffset_y() {
    return trtcenginewarperJNI.Region_offset_y_get(swigCPtr, this);
  }

  public void setWidth(int value) {
    trtcenginewarperJNI.Region_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return trtcenginewarperJNI.Region_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    trtcenginewarperJNI.Region_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return trtcenginewarperJNI.Region_height_get(swigCPtr, this);
  }

  public void setBgcolor(int value) {
    trtcenginewarperJNI.Region_bgcolor_set(swigCPtr, this, value);
  }

  public int getBgcolor() {
    return trtcenginewarperJNI.Region_bgcolor_get(swigCPtr, this);
  }

  public void setOption(RegionOption value) {
    trtcenginewarperJNI.Region_option_set(swigCPtr, this, value.swigValue());
  }

  public RegionOption getOption() {
    return RegionOption.swigToEnum(trtcenginewarperJNI.Region_option_get(swigCPtr, this));
  }

  public void setZOrder(int value) {
    trtcenginewarperJNI.Region_zOrder_set(swigCPtr, this, value);
  }

  public int getZOrder() {
    return trtcenginewarperJNI.Region_zOrder_get(swigCPtr, this);
  }

  public Region() {
    this(trtcenginewarperJNI.new_Region__SWIG_0(), true);
  }

  public Region(Region obj) {
    this(trtcenginewarperJNI.new_Region__SWIG_1(Region.getCPtr(obj), obj), true);
  }

  public Region(int x, int y, int width, int height, int bgcolor, RegionOption fitmode, int zOrder) {
    this(trtcenginewarperJNI.new_Region__SWIG_2(x, y, width, height, bgcolor, fitmode.swigValue(), zOrder), true);
  }

}
