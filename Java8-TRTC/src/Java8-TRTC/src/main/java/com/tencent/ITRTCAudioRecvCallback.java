/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.tencent;

public class ITRTCAudioRecvCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ITRTCAudioRecvCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITRTCAudioRecvCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        trtcenginewarperJNI.delete_ITRTCAudioRecvCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    trtcenginewarperJNI.ITRTCAudioRecvCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    trtcenginewarperJNI.ITRTCAudioRecvCallback_change_ownership(this, swigCPtr, true);
  }

  public void onRecvAudioFrame(String userId, TRTCAudioFrame frame) {
    if (getClass() == ITRTCAudioRecvCallback.class) trtcenginewarperJNI.ITRTCAudioRecvCallback_onRecvAudioFrame(swigCPtr, this, userId, TRTCAudioFrame.getCPtr(frame), frame); else trtcenginewarperJNI.ITRTCAudioRecvCallback_onRecvAudioFrameSwigExplicitITRTCAudioRecvCallback(swigCPtr, this, userId, TRTCAudioFrame.getCPtr(frame), frame);
  }

  public ITRTCAudioRecvCallback() {
    this(trtcenginewarperJNI.new_ITRTCAudioRecvCallback(), true);
    trtcenginewarperJNI.ITRTCAudioRecvCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
