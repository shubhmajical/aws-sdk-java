/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the value H_264.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/H264Settings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H264Settings implements Serializable, Cloneable, StructuredPojo {

    private String adaptiveQuantization;
    /**
     * Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000 or 5m.
     * Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     */
    private Integer bitrate;

    private String codecLevel;

    private String codecProfile;

    private String entropyEncoding;

    private String fieldEncoding;

    private String flickerAdaptiveQuantization;

    private String framerateControl;

    private String framerateConversionAlgorithm;
    /**
     * When you use the API for transcode jobs that use framerate conversion, specify the framerate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * framerate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     */
    private Integer framerateDenominator;
    /** Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps. */
    private Integer framerateNumerator;

    private String gopBReference;
    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     */
    private Integer gopClosedCadence;
    /** GOP Length (keyframe interval) in frames or seconds. Must be greater than zero. */
    private Double gopSize;

    private String gopSizeUnits;
    /** Percentage of the buffer that should initially be filled (HRD buffer model). */
    private Integer hrdBufferInitialFillPercentage;
    /**
     * Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits can be
     * entered as 500000 or 0.5m.
     */
    private Integer hrdBufferSize;

    private String interlaceMode;
    /**
     * Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five hundred
     * kilobits can be entered as 500000 or 0.5m.
     */
    private Integer maxBitrate;
    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     */
    private Integer minIInterval;
    /** Number of B-frames between reference frames. */
    private Integer numberBFramesBetweenReferenceFrames;
    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     */
    private Integer numberReferenceFrames;

    private String parControl;
    /** Pixel Aspect Ratio denominator. */
    private Integer parDenominator;
    /** Pixel Aspect Ratio numerator. */
    private Integer parNumerator;

    private String qualityTuningLevel;

    private String rateControlMode;

    private String repeatPps;

    private String sceneChangeDetect;
    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */
    private Integer slices;

    private String slowPal;
    /** Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image. */
    private Integer softness;

    private String spatialAdaptiveQuantization;

    private String syntax;

    private String telecine;

    private String temporalAdaptiveQuantization;

    private String unregisteredSeiTimecode;

    /**
     * @param adaptiveQuantization
     * @see H264AdaptiveQuantization
     */

    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * @return
     * @see H264AdaptiveQuantization
     */

    public String getAdaptiveQuantization() {
        return this.adaptiveQuantization;
    }

    /**
     * @param adaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264AdaptiveQuantization
     */

    public H264Settings withAdaptiveQuantization(String adaptiveQuantization) {
        setAdaptiveQuantization(adaptiveQuantization);
        return this;
    }

    /**
     * @param adaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264AdaptiveQuantization
     */

    public H264Settings withAdaptiveQuantization(H264AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000 or 5m.
     * Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000 or
     *        5m. Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be unique
     *        when rounded down to the nearest multiple of 1000.
     */

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000 or 5m.
     * Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     * 
     * @return Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000
     *         or 5m. Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be
     *         unique when rounded down to the nearest multiple of 1000.
     */

    public Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000 or 5m.
     * Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be unique when
     * rounded down to the nearest multiple of 1000.
     * 
     * @param bitrate
     *        Average bitrate in bits/second. Required for VBR, CBR, and ABR. Five megabits can be entered as 5000000 or
     *        5m. Five hundred kilobits can be entered as 500000 or 0.5m. For MS Smooth outputs, bitrates must be unique
     *        when rounded down to the nearest multiple of 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withBitrate(Integer bitrate) {
        setBitrate(bitrate);
        return this;
    }

    /**
     * @param codecLevel
     * @see H264CodecLevel
     */

    public void setCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
    }

    /**
     * @return
     * @see H264CodecLevel
     */

    public String getCodecLevel() {
        return this.codecLevel;
    }

    /**
     * @param codecLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264CodecLevel
     */

    public H264Settings withCodecLevel(String codecLevel) {
        setCodecLevel(codecLevel);
        return this;
    }

    /**
     * @param codecLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264CodecLevel
     */

    public H264Settings withCodecLevel(H264CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
        return this;
    }

    /**
     * @param codecProfile
     * @see H264CodecProfile
     */

    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * @return
     * @see H264CodecProfile
     */

    public String getCodecProfile() {
        return this.codecProfile;
    }

    /**
     * @param codecProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264CodecProfile
     */

    public H264Settings withCodecProfile(String codecProfile) {
        setCodecProfile(codecProfile);
        return this;
    }

    /**
     * @param codecProfile
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264CodecProfile
     */

    public H264Settings withCodecProfile(H264CodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * @param entropyEncoding
     * @see H264EntropyEncoding
     */

    public void setEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
    }

    /**
     * @return
     * @see H264EntropyEncoding
     */

    public String getEntropyEncoding() {
        return this.entropyEncoding;
    }

    /**
     * @param entropyEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264EntropyEncoding
     */

    public H264Settings withEntropyEncoding(String entropyEncoding) {
        setEntropyEncoding(entropyEncoding);
        return this;
    }

    /**
     * @param entropyEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264EntropyEncoding
     */

    public H264Settings withEntropyEncoding(H264EntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
        return this;
    }

    /**
     * @param fieldEncoding
     * @see H264FieldEncoding
     */

    public void setFieldEncoding(String fieldEncoding) {
        this.fieldEncoding = fieldEncoding;
    }

    /**
     * @return
     * @see H264FieldEncoding
     */

    public String getFieldEncoding() {
        return this.fieldEncoding;
    }

    /**
     * @param fieldEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FieldEncoding
     */

    public H264Settings withFieldEncoding(String fieldEncoding) {
        setFieldEncoding(fieldEncoding);
        return this;
    }

    /**
     * @param fieldEncoding
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FieldEncoding
     */

    public H264Settings withFieldEncoding(H264FieldEncoding fieldEncoding) {
        this.fieldEncoding = fieldEncoding.toString();
        return this;
    }

    /**
     * @param flickerAdaptiveQuantization
     * @see H264FlickerAdaptiveQuantization
     */

    public void setFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization;
    }

    /**
     * @return
     * @see H264FlickerAdaptiveQuantization
     */

    public String getFlickerAdaptiveQuantization() {
        return this.flickerAdaptiveQuantization;
    }

    /**
     * @param flickerAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FlickerAdaptiveQuantization
     */

    public H264Settings withFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        setFlickerAdaptiveQuantization(flickerAdaptiveQuantization);
        return this;
    }

    /**
     * @param flickerAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FlickerAdaptiveQuantization
     */

    public H264Settings withFlickerAdaptiveQuantization(H264FlickerAdaptiveQuantization flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization.toString();
        return this;
    }

    /**
     * @param framerateControl
     * @see H264FramerateControl
     */

    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * @return
     * @see H264FramerateControl
     */

    public String getFramerateControl() {
        return this.framerateControl;
    }

    /**
     * @param framerateControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FramerateControl
     */

    public H264Settings withFramerateControl(String framerateControl) {
        setFramerateControl(framerateControl);
        return this;
    }

    /**
     * @param framerateControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FramerateControl
     */

    public H264Settings withFramerateControl(H264FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * @param framerateConversionAlgorithm
     * @see H264FramerateConversionAlgorithm
     */

    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * @return
     * @see H264FramerateConversionAlgorithm
     */

    public String getFramerateConversionAlgorithm() {
        return this.framerateConversionAlgorithm;
    }

    /**
     * @param framerateConversionAlgorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FramerateConversionAlgorithm
     */

    public H264Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        setFramerateConversionAlgorithm(framerateConversionAlgorithm);
        return this;
    }

    /**
     * @param framerateConversionAlgorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264FramerateConversionAlgorithm
     */

    public H264Settings withFramerateConversionAlgorithm(H264FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * When you use the API for transcode jobs that use framerate conversion, specify the framerate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * framerate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use framerate conversion, specify the framerate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use framerate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     */

    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use framerate conversion, specify the framerate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * framerate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @return When you use the API for transcode jobs that use framerate conversion, specify the framerate as a
     *         fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *         this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *         for transcode jobs that use framerate conversion, provide the value as a decimal number for Framerate. In
     *         this example, specify 23.976.
     */

    public Integer getFramerateDenominator() {
        return this.framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use framerate conversion, specify the framerate as a fraction. For
     * example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this
     * example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use
     * framerate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
     * 
     * @param framerateDenominator
     *        When you use the API for transcode jobs that use framerate conversion, specify the framerate as a
     *        fraction. For example, 24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of
     *        this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console
     *        for transcode jobs that use framerate conversion, provide the value as a decimal number for Framerate. In
     *        this example, specify 23.976.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withFramerateDenominator(Integer framerateDenominator) {
        setFramerateDenominator(framerateDenominator);
        return this;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @param framerateNumerator
     *        Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     */

    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @return Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     */

    public Integer getFramerateNumerator() {
        return this.framerateNumerator;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * 
     * @param framerateNumerator
     *        Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withFramerateNumerator(Integer framerateNumerator) {
        setFramerateNumerator(framerateNumerator);
        return this;
    }

    /**
     * @param gopBReference
     * @see H264GopBReference
     */

    public void setGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
    }

    /**
     * @return
     * @see H264GopBReference
     */

    public String getGopBReference() {
        return this.gopBReference;
    }

    /**
     * @param gopBReference
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264GopBReference
     */

    public H264Settings withGopBReference(String gopBReference) {
        setGopBReference(gopBReference);
        return this;
    }

    /**
     * @param gopBReference
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264GopBReference
     */

    public H264Settings withGopBReference(H264GopBReference gopBReference) {
        this.gopBReference = gopBReference.toString();
        return this;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @param gopClosedCadence
     *        Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *        joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *        output segmenting.
     */

    public void setGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @return Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *         joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *         output segmenting.
     */

    public Integer getGopClosedCadence() {
        return this.gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining
     * mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * 
     * @param gopClosedCadence
     *        Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder
     *        joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break
     *        output segmenting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withGopClosedCadence(Integer gopClosedCadence) {
        setGopClosedCadence(gopClosedCadence);
        return this;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     */

    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @return GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     */

    public Double getGopSize() {
        return this.gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * 
     * @param gopSize
     *        GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withGopSize(Double gopSize) {
        setGopSize(gopSize);
        return this;
    }

    /**
     * @param gopSizeUnits
     * @see H264GopSizeUnits
     */

    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * @return
     * @see H264GopSizeUnits
     */

    public String getGopSizeUnits() {
        return this.gopSizeUnits;
    }

    /**
     * @param gopSizeUnits
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264GopSizeUnits
     */

    public H264Settings withGopSizeUnits(String gopSizeUnits) {
        setGopSizeUnits(gopSizeUnits);
        return this;
    }

    /**
     * @param gopSizeUnits
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264GopSizeUnits
     */

    public H264Settings withGopSizeUnits(H264GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param hrdBufferInitialFillPercentage
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public void setHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        this.hrdBufferInitialFillPercentage = hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @return Percentage of the buffer that should initially be filled (HRD buffer model).
     */

    public Integer getHrdBufferInitialFillPercentage() {
        return this.hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer model).
     * 
     * @param hrdBufferInitialFillPercentage
     *        Percentage of the buffer that should initially be filled (HRD buffer model).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        setHrdBufferInitialFillPercentage(hrdBufferInitialFillPercentage);
        return this;
    }

    /**
     * Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits can be
     * entered as 500000 or 0.5m.
     * 
     * @param hrdBufferSize
     *        Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits
     *        can be entered as 500000 or 0.5m.
     */

    public void setHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits can be
     * entered as 500000 or 0.5m.
     * 
     * @return Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits
     *         can be entered as 500000 or 0.5m.
     */

    public Integer getHrdBufferSize() {
        return this.hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits can be
     * entered as 500000 or 0.5m.
     * 
     * @param hrdBufferSize
     *        Size of buffer (HRD buffer model). Five megabits can be entered as 5000000 or 5m. Five hundred kilobits
     *        can be entered as 500000 or 0.5m.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withHrdBufferSize(Integer hrdBufferSize) {
        setHrdBufferSize(hrdBufferSize);
        return this;
    }

    /**
     * @param interlaceMode
     * @see H264InterlaceMode
     */

    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * @return
     * @see H264InterlaceMode
     */

    public String getInterlaceMode() {
        return this.interlaceMode;
    }

    /**
     * @param interlaceMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264InterlaceMode
     */

    public H264Settings withInterlaceMode(String interlaceMode) {
        setInterlaceMode(interlaceMode);
        return this;
    }

    /**
     * @param interlaceMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264InterlaceMode
     */

    public H264Settings withInterlaceMode(H264InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five hundred
     * kilobits can be entered as 500000 or 0.5m.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five
     *        hundred kilobits can be entered as 500000 or 0.5m.
     */

    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five hundred
     * kilobits can be entered as 500000 or 0.5m.
     * 
     * @return Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five
     *         hundred kilobits can be entered as 500000 or 0.5m.
     */

    public Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five hundred
     * kilobits can be entered as 500000 or 0.5m.
     * 
     * @param maxBitrate
     *        Maximum bitrate in bits/second (for VBR mode only). Five megabits can be entered as 5000000 or 5m. Five
     *        hundred kilobits can be entered as 500000 or 0.5m.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withMaxBitrate(Integer maxBitrate) {
        setMaxBitrate(maxBitrate);
        return this;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *        Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @return Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *         If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *         stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *         I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *         Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     */

    public Integer getMinIInterval() {
        return this.minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the
     * scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence
     * resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch
     * = GOP size + Min-I-interval - 1
     * 
     * @param minIInterval
     *        Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection.
     *        If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *        stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting
     *        I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change
     *        Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withMinIInterval(Integer minIInterval) {
        setMinIInterval(minIInterval);
        return this;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Number of B-frames between reference frames.
     */

    public void setNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @return Number of B-frames between reference frames.
     */

    public Integer getNumberBFramesBetweenReferenceFrames() {
        return this.numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * 
     * @param numberBFramesBetweenReferenceFrames
     *        Number of B-frames between reference frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        setNumberBFramesBetweenReferenceFrames(numberBFramesBetweenReferenceFrames);
        return this;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @param numberReferenceFrames
     *        Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *        interlaced encoding.
     */

    public void setNumberReferenceFrames(Integer numberReferenceFrames) {
        this.numberReferenceFrames = numberReferenceFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @return Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *         interlaced encoding.
     */

    public Integer getNumberReferenceFrames() {
        return this.numberReferenceFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced
     * encoding.
     * 
     * @param numberReferenceFrames
     *        Number of reference frames to use. The encoder may use more than requested if using B-frames and/or
     *        interlaced encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withNumberReferenceFrames(Integer numberReferenceFrames) {
        setNumberReferenceFrames(numberReferenceFrames);
        return this;
    }

    /**
     * @param parControl
     * @see H264ParControl
     */

    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * @return
     * @see H264ParControl
     */

    public String getParControl() {
        return this.parControl;
    }

    /**
     * @param parControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264ParControl
     */

    public H264Settings withParControl(String parControl) {
        setParControl(parControl);
        return this;
    }

    /**
     * @param parControl
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264ParControl
     */

    public H264Settings withParControl(H264ParControl parControl) {
        this.parControl = parControl.toString();
        return this;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * 
     * @param parDenominator
     *        Pixel Aspect Ratio denominator.
     */

    public void setParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * 
     * @return Pixel Aspect Ratio denominator.
     */

    public Integer getParDenominator() {
        return this.parDenominator;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * 
     * @param parDenominator
     *        Pixel Aspect Ratio denominator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withParDenominator(Integer parDenominator) {
        setParDenominator(parDenominator);
        return this;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * 
     * @param parNumerator
     *        Pixel Aspect Ratio numerator.
     */

    public void setParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * 
     * @return Pixel Aspect Ratio numerator.
     */

    public Integer getParNumerator() {
        return this.parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * 
     * @param parNumerator
     *        Pixel Aspect Ratio numerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withParNumerator(Integer parNumerator) {
        setParNumerator(parNumerator);
        return this;
    }

    /**
     * @param qualityTuningLevel
     * @see H264QualityTuningLevel
     */

    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * @return
     * @see H264QualityTuningLevel
     */

    public String getQualityTuningLevel() {
        return this.qualityTuningLevel;
    }

    /**
     * @param qualityTuningLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264QualityTuningLevel
     */

    public H264Settings withQualityTuningLevel(String qualityTuningLevel) {
        setQualityTuningLevel(qualityTuningLevel);
        return this;
    }

    /**
     * @param qualityTuningLevel
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264QualityTuningLevel
     */

    public H264Settings withQualityTuningLevel(H264QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * @param rateControlMode
     * @see H264RateControlMode
     */

    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * @return
     * @see H264RateControlMode
     */

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * @param rateControlMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264RateControlMode
     */

    public H264Settings withRateControlMode(String rateControlMode) {
        setRateControlMode(rateControlMode);
        return this;
    }

    /**
     * @param rateControlMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264RateControlMode
     */

    public H264Settings withRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * @param repeatPps
     * @see H264RepeatPps
     */

    public void setRepeatPps(String repeatPps) {
        this.repeatPps = repeatPps;
    }

    /**
     * @return
     * @see H264RepeatPps
     */

    public String getRepeatPps() {
        return this.repeatPps;
    }

    /**
     * @param repeatPps
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264RepeatPps
     */

    public H264Settings withRepeatPps(String repeatPps) {
        setRepeatPps(repeatPps);
        return this;
    }

    /**
     * @param repeatPps
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264RepeatPps
     */

    public H264Settings withRepeatPps(H264RepeatPps repeatPps) {
        this.repeatPps = repeatPps.toString();
        return this;
    }

    /**
     * @param sceneChangeDetect
     * @see H264SceneChangeDetect
     */

    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * @return
     * @see H264SceneChangeDetect
     */

    public String getSceneChangeDetect() {
        return this.sceneChangeDetect;
    }

    /**
     * @param sceneChangeDetect
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SceneChangeDetect
     */

    public H264Settings withSceneChangeDetect(String sceneChangeDetect) {
        setSceneChangeDetect(sceneChangeDetect);
        return this;
    }

    /**
     * @param sceneChangeDetect
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SceneChangeDetect
     */

    public H264Settings withSceneChangeDetect(H264SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * 
     * @param slices
     *        Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *        pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */

    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * 
     * @return Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *         pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     */

    public Integer getSlices() {
        return this.slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     * pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * 
     * @param slices
     *        Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive
     *        pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withSlices(Integer slices) {
        setSlices(slices);
        return this;
    }

    /**
     * @param slowPal
     * @see H264SlowPal
     */

    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * @return
     * @see H264SlowPal
     */

    public String getSlowPal() {
        return this.slowPal;
    }

    /**
     * @param slowPal
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SlowPal
     */

    public H264Settings withSlowPal(String slowPal) {
        setSlowPal(slowPal);
        return this;
    }

    /**
     * @param slowPal
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SlowPal
     */

    public H264Settings withSlowPal(H264SlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * 
     * @param softness
     *        Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     */

    public void setSoftness(Integer softness) {
        this.softness = softness;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * 
     * @return Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     */

    public Integer getSoftness() {
        return this.softness;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * 
     * @param softness
     *        Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public H264Settings withSoftness(Integer softness) {
        setSoftness(softness);
        return this;
    }

    /**
     * @param spatialAdaptiveQuantization
     * @see H264SpatialAdaptiveQuantization
     */

    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * @return
     * @see H264SpatialAdaptiveQuantization
     */

    public String getSpatialAdaptiveQuantization() {
        return this.spatialAdaptiveQuantization;
    }

    /**
     * @param spatialAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SpatialAdaptiveQuantization
     */

    public H264Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        setSpatialAdaptiveQuantization(spatialAdaptiveQuantization);
        return this;
    }

    /**
     * @param spatialAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264SpatialAdaptiveQuantization
     */

    public H264Settings withSpatialAdaptiveQuantization(H264SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
        return this;
    }

    /**
     * @param syntax
     * @see H264Syntax
     */

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    /**
     * @return
     * @see H264Syntax
     */

    public String getSyntax() {
        return this.syntax;
    }

    /**
     * @param syntax
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Syntax
     */

    public H264Settings withSyntax(String syntax) {
        setSyntax(syntax);
        return this;
    }

    /**
     * @param syntax
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Syntax
     */

    public H264Settings withSyntax(H264Syntax syntax) {
        this.syntax = syntax.toString();
        return this;
    }

    /**
     * @param telecine
     * @see H264Telecine
     */

    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * @return
     * @see H264Telecine
     */

    public String getTelecine() {
        return this.telecine;
    }

    /**
     * @param telecine
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Telecine
     */

    public H264Settings withTelecine(String telecine) {
        setTelecine(telecine);
        return this;
    }

    /**
     * @param telecine
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264Telecine
     */

    public H264Settings withTelecine(H264Telecine telecine) {
        this.telecine = telecine.toString();
        return this;
    }

    /**
     * @param temporalAdaptiveQuantization
     * @see H264TemporalAdaptiveQuantization
     */

    public void setTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
    }

    /**
     * @return
     * @see H264TemporalAdaptiveQuantization
     */

    public String getTemporalAdaptiveQuantization() {
        return this.temporalAdaptiveQuantization;
    }

    /**
     * @param temporalAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264TemporalAdaptiveQuantization
     */

    public H264Settings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        setTemporalAdaptiveQuantization(temporalAdaptiveQuantization);
        return this;
    }

    /**
     * @param temporalAdaptiveQuantization
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264TemporalAdaptiveQuantization
     */

    public H264Settings withTemporalAdaptiveQuantization(H264TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
        return this;
    }

    /**
     * @param unregisteredSeiTimecode
     * @see H264UnregisteredSeiTimecode
     */

    public void setUnregisteredSeiTimecode(String unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode;
    }

    /**
     * @return
     * @see H264UnregisteredSeiTimecode
     */

    public String getUnregisteredSeiTimecode() {
        return this.unregisteredSeiTimecode;
    }

    /**
     * @param unregisteredSeiTimecode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264UnregisteredSeiTimecode
     */

    public H264Settings withUnregisteredSeiTimecode(String unregisteredSeiTimecode) {
        setUnregisteredSeiTimecode(unregisteredSeiTimecode);
        return this;
    }

    /**
     * @param unregisteredSeiTimecode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see H264UnregisteredSeiTimecode
     */

    public H264Settings withUnregisteredSeiTimecode(H264UnregisteredSeiTimecode unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAdaptiveQuantization() != null)
            sb.append("AdaptiveQuantization: ").append(getAdaptiveQuantization()).append(",");
        if (getBitrate() != null)
            sb.append("Bitrate: ").append(getBitrate()).append(",");
        if (getCodecLevel() != null)
            sb.append("CodecLevel: ").append(getCodecLevel()).append(",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: ").append(getCodecProfile()).append(",");
        if (getEntropyEncoding() != null)
            sb.append("EntropyEncoding: ").append(getEntropyEncoding()).append(",");
        if (getFieldEncoding() != null)
            sb.append("FieldEncoding: ").append(getFieldEncoding()).append(",");
        if (getFlickerAdaptiveQuantization() != null)
            sb.append("FlickerAdaptiveQuantization: ").append(getFlickerAdaptiveQuantization()).append(",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: ").append(getFramerateControl()).append(",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: ").append(getFramerateConversionAlgorithm()).append(",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: ").append(getFramerateDenominator()).append(",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: ").append(getFramerateNumerator()).append(",");
        if (getGopBReference() != null)
            sb.append("GopBReference: ").append(getGopBReference()).append(",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: ").append(getGopClosedCadence()).append(",");
        if (getGopSize() != null)
            sb.append("GopSize: ").append(getGopSize()).append(",");
        if (getGopSizeUnits() != null)
            sb.append("GopSizeUnits: ").append(getGopSizeUnits()).append(",");
        if (getHrdBufferInitialFillPercentage() != null)
            sb.append("HrdBufferInitialFillPercentage: ").append(getHrdBufferInitialFillPercentage()).append(",");
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: ").append(getHrdBufferSize()).append(",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: ").append(getInterlaceMode()).append(",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: ").append(getMaxBitrate()).append(",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: ").append(getMinIInterval()).append(",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: ").append(getNumberBFramesBetweenReferenceFrames()).append(",");
        if (getNumberReferenceFrames() != null)
            sb.append("NumberReferenceFrames: ").append(getNumberReferenceFrames()).append(",");
        if (getParControl() != null)
            sb.append("ParControl: ").append(getParControl()).append(",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: ").append(getParDenominator()).append(",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: ").append(getParNumerator()).append(",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: ").append(getQualityTuningLevel()).append(",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: ").append(getRateControlMode()).append(",");
        if (getRepeatPps() != null)
            sb.append("RepeatPps: ").append(getRepeatPps()).append(",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: ").append(getSceneChangeDetect()).append(",");
        if (getSlices() != null)
            sb.append("Slices: ").append(getSlices()).append(",");
        if (getSlowPal() != null)
            sb.append("SlowPal: ").append(getSlowPal()).append(",");
        if (getSoftness() != null)
            sb.append("Softness: ").append(getSoftness()).append(",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: ").append(getSpatialAdaptiveQuantization()).append(",");
        if (getSyntax() != null)
            sb.append("Syntax: ").append(getSyntax()).append(",");
        if (getTelecine() != null)
            sb.append("Telecine: ").append(getTelecine()).append(",");
        if (getTemporalAdaptiveQuantization() != null)
            sb.append("TemporalAdaptiveQuantization: ").append(getTemporalAdaptiveQuantization()).append(",");
        if (getUnregisteredSeiTimecode() != null)
            sb.append("UnregisteredSeiTimecode: ").append(getUnregisteredSeiTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H264Settings == false)
            return false;
        H264Settings other = (H264Settings) obj;
        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecLevel() == null ^ this.getCodecLevel() == null)
            return false;
        if (other.getCodecLevel() != null && other.getCodecLevel().equals(this.getCodecLevel()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getEntropyEncoding() == null ^ this.getEntropyEncoding() == null)
            return false;
        if (other.getEntropyEncoding() != null && other.getEntropyEncoding().equals(this.getEntropyEncoding()) == false)
            return false;
        if (other.getFieldEncoding() == null ^ this.getFieldEncoding() == null)
            return false;
        if (other.getFieldEncoding() != null && other.getFieldEncoding().equals(this.getFieldEncoding()) == false)
            return false;
        if (other.getFlickerAdaptiveQuantization() == null ^ this.getFlickerAdaptiveQuantization() == null)
            return false;
        if (other.getFlickerAdaptiveQuantization() != null && other.getFlickerAdaptiveQuantization().equals(this.getFlickerAdaptiveQuantization()) == false)
            return false;
        if (other.getFramerateControl() == null ^ this.getFramerateControl() == null)
            return false;
        if (other.getFramerateControl() != null && other.getFramerateControl().equals(this.getFramerateControl()) == false)
            return false;
        if (other.getFramerateConversionAlgorithm() == null ^ this.getFramerateConversionAlgorithm() == null)
            return false;
        if (other.getFramerateConversionAlgorithm() != null && other.getFramerateConversionAlgorithm().equals(this.getFramerateConversionAlgorithm()) == false)
            return false;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        if (other.getGopBReference() == null ^ this.getGopBReference() == null)
            return false;
        if (other.getGopBReference() != null && other.getGopBReference().equals(this.getGopBReference()) == false)
            return false;
        if (other.getGopClosedCadence() == null ^ this.getGopClosedCadence() == null)
            return false;
        if (other.getGopClosedCadence() != null && other.getGopClosedCadence().equals(this.getGopClosedCadence()) == false)
            return false;
        if (other.getGopSize() == null ^ this.getGopSize() == null)
            return false;
        if (other.getGopSize() != null && other.getGopSize().equals(this.getGopSize()) == false)
            return false;
        if (other.getGopSizeUnits() == null ^ this.getGopSizeUnits() == null)
            return false;
        if (other.getGopSizeUnits() != null && other.getGopSizeUnits().equals(this.getGopSizeUnits()) == false)
            return false;
        if (other.getHrdBufferInitialFillPercentage() == null ^ this.getHrdBufferInitialFillPercentage() == null)
            return false;
        if (other.getHrdBufferInitialFillPercentage() != null
                && other.getHrdBufferInitialFillPercentage().equals(this.getHrdBufferInitialFillPercentage()) == false)
            return false;
        if (other.getHrdBufferSize() == null ^ this.getHrdBufferSize() == null)
            return false;
        if (other.getHrdBufferSize() != null && other.getHrdBufferSize().equals(this.getHrdBufferSize()) == false)
            return false;
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getMinIInterval() == null ^ this.getMinIInterval() == null)
            return false;
        if (other.getMinIInterval() != null && other.getMinIInterval().equals(this.getMinIInterval()) == false)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() == null ^ this.getNumberBFramesBetweenReferenceFrames() == null)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() != null
                && other.getNumberBFramesBetweenReferenceFrames().equals(this.getNumberBFramesBetweenReferenceFrames()) == false)
            return false;
        if (other.getNumberReferenceFrames() == null ^ this.getNumberReferenceFrames() == null)
            return false;
        if (other.getNumberReferenceFrames() != null && other.getNumberReferenceFrames().equals(this.getNumberReferenceFrames()) == false)
            return false;
        if (other.getParControl() == null ^ this.getParControl() == null)
            return false;
        if (other.getParControl() != null && other.getParControl().equals(this.getParControl()) == false)
            return false;
        if (other.getParDenominator() == null ^ this.getParDenominator() == null)
            return false;
        if (other.getParDenominator() != null && other.getParDenominator().equals(this.getParDenominator()) == false)
            return false;
        if (other.getParNumerator() == null ^ this.getParNumerator() == null)
            return false;
        if (other.getParNumerator() != null && other.getParNumerator().equals(this.getParNumerator()) == false)
            return false;
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getRepeatPps() == null ^ this.getRepeatPps() == null)
            return false;
        if (other.getRepeatPps() != null && other.getRepeatPps().equals(this.getRepeatPps()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getSoftness() == null ^ this.getSoftness() == null)
            return false;
        if (other.getSoftness() != null && other.getSoftness().equals(this.getSoftness()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null && other.getSpatialAdaptiveQuantization().equals(this.getSpatialAdaptiveQuantization()) == false)
            return false;
        if (other.getSyntax() == null ^ this.getSyntax() == null)
            return false;
        if (other.getSyntax() != null && other.getSyntax().equals(this.getSyntax()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        if (other.getTemporalAdaptiveQuantization() == null ^ this.getTemporalAdaptiveQuantization() == null)
            return false;
        if (other.getTemporalAdaptiveQuantization() != null && other.getTemporalAdaptiveQuantization().equals(this.getTemporalAdaptiveQuantization()) == false)
            return false;
        if (other.getUnregisteredSeiTimecode() == null ^ this.getUnregisteredSeiTimecode() == null)
            return false;
        if (other.getUnregisteredSeiTimecode() != null && other.getUnregisteredSeiTimecode().equals(this.getUnregisteredSeiTimecode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecLevel() == null) ? 0 : getCodecLevel().hashCode());
        hashCode = prime * hashCode + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode + ((getEntropyEncoding() == null) ? 0 : getEntropyEncoding().hashCode());
        hashCode = prime * hashCode + ((getFieldEncoding() == null) ? 0 : getFieldEncoding().hashCode());
        hashCode = prime * hashCode + ((getFlickerAdaptiveQuantization() == null) ? 0 : getFlickerAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode + ((getFramerateConversionAlgorithm() == null) ? 0 : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
        hashCode = prime * hashCode + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferInitialFillPercentage() == null) ? 0 : getHrdBufferInitialFillPercentage().hashCode());
        hashCode = prime * hashCode + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0 : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getNumberReferenceFrames() == null) ? 0 : getNumberReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRepeatPps() == null) ? 0 : getRepeatPps().hashCode());
        hashCode = prime * hashCode + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime * hashCode + ((getSpatialAdaptiveQuantization() == null) ? 0 : getSpatialAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getSyntax() == null) ? 0 : getSyntax().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        hashCode = prime * hashCode + ((getTemporalAdaptiveQuantization() == null) ? 0 : getTemporalAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getUnregisteredSeiTimecode() == null) ? 0 : getUnregisteredSeiTimecode().hashCode());
        return hashCode;
    }

    @Override
    public H264Settings clone() {
        try {
            return (H264Settings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.H264SettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
