/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.consumersurveys.model;

/**
 * Message defining the question specifications.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Consumer Surveys API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SurveyQuestion extends com.google.api.client.json.GenericJson {

  /**
   * The number of answers needed for each option for a multiple choice question. When set, when the
   * number of answers for an option is reached, the option is excluded from the question. The
   * answer_count_limit given will be targeted at best but you may receive more answers than
   * expected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer answerCountLimitPerOption;

  /**
   * The randomization option for multiple choice and multi-select questions. If nothing is
   * specified, the API enforces the default of RANDOMIZE, which applies only to multiple choice-
   * style questions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answerOrder;

  /**
   * Required list of answer options for a question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> answers;

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque and limited to 64K.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerData;

  /**
   * Option to allow open-ended text box for multi and multi-select question types. This can be used
   * with MULTIPLE_CHOICE_QUESTION, MULTIPLE_CHOICE_WITH_IMAGE_QUESTION, MULTI_SELECT_QUESTION, and
   * MULTI_SELECT_WITH_IMAGE_QUESTION question types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasOther;

  /**
   * For rating questions, the text for the higher end of the scale, such as 'Best'. For numeric
   * questions, a string representing a floating-point that is the maximum allowed number for a
   * response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String highValueLabel;

  /**
   * The alt_text property is required for image question types.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageAltText;

  /**
   * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question types. Maximum size
   * of 5MB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageData;

  /**
   * Currently only support pinning an answer option to the last position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean lastAnswerPositionPinned;

  /**
   * For rating questions, the text for the lower end of the scale, such as 'Worst'. For numeric
   * questions, a string representing a floating-point that is the minimum allowed number for a
   * response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lowValueLabel;

  /**
   * The number of answers to be displayed for a multiple choice question. If not set, it is the
   * number of answers. If set, the answers shown are chosen randomly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numAnswersDisplayed;

  /**
   * Number of stars to use for ratings questions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String numStars;

  /**
   * Placeholder text for an open text question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String openTextPlaceholder;

  /**
   * A list of suggested answers for open text question auto-complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> openTextSuggestions;

  /**
   * Required question text shown to the respondent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String question;

  /**
   * Option to allow multiple line open text responses instead of a single line response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleLineResponse;

  /**
   * The threshold/screener answer options, which will screen a user into the rest of the survey.
   * These will be a subset of the answer option strings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> thresholdAnswers;

  /**
   * Required field defining the question type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional unit of measurement for display (ie. hours, people, miles).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unitOfMeasurementLabel;

  /**
   * Where the unit_of_measurement string should appear in relation to the input field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unitsPosition;

  /**
   * The youtube video id to be show in video questions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoId;

  /**
   * The number of answers needed for each option for a multiple choice question. When set, when the
   * number of answers for an option is reached, the option is excluded from the question. The
   * answer_count_limit given will be targeted at best but you may receive more answers than
   * expected.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAnswerCountLimitPerOption() {
    return answerCountLimitPerOption;
  }

  /**
   * The number of answers needed for each option for a multiple choice question. When set, when the
   * number of answers for an option is reached, the option is excluded from the question. The
   * answer_count_limit given will be targeted at best but you may receive more answers than
   * expected.
   * @param answerCountLimitPerOption answerCountLimitPerOption or {@code null} for none
   */
  public SurveyQuestion setAnswerCountLimitPerOption(java.lang.Integer answerCountLimitPerOption) {
    this.answerCountLimitPerOption = answerCountLimitPerOption;
    return this;
  }

  /**
   * The randomization option for multiple choice and multi-select questions. If nothing is
   * specified, the API enforces the default of RANDOMIZE, which applies only to multiple choice-
   * style questions.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswerOrder() {
    return answerOrder;
  }

  /**
   * The randomization option for multiple choice and multi-select questions. If nothing is
   * specified, the API enforces the default of RANDOMIZE, which applies only to multiple choice-
   * style questions.
   * @param answerOrder answerOrder or {@code null} for none
   */
  public SurveyQuestion setAnswerOrder(java.lang.String answerOrder) {
    this.answerOrder = answerOrder;
    return this;
  }

  /**
   * Required list of answer options for a question.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAnswers() {
    return answers;
  }

  /**
   * Required list of answer options for a question.
   * @param answers answers or {@code null} for none
   */
  public SurveyQuestion setAnswers(java.util.List<java.lang.String> answers) {
    this.answers = answers;
    return this;
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque and limited to 64K.
   * @see #decodeCustomerData()
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerData() {
    return customerData;
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque and limited to 64K.
   * @see #getCustomerData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCustomerData() {
    return com.google.api.client.util.Base64.decodeBase64(customerData);
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque and limited to 64K.
   * @see #encodeCustomerData()
   * @param customerData customerData or {@code null} for none
   */
  public SurveyQuestion setCustomerData(java.lang.String customerData) {
    this.customerData = customerData;
    return this;
  }

  /**
   * Additional information to store on behalf of the API consumer and associate with this question.
   * This binary blob is treated as opaque and limited to 64K.
   * @see #setCustomerData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SurveyQuestion encodeCustomerData(byte[] customerData) {
    this.customerData = com.google.api.client.util.Base64.encodeBase64URLSafeString(customerData);
    return this;
  }

  /**
   * Option to allow open-ended text box for multi and multi-select question types. This can be used
   * with MULTIPLE_CHOICE_QUESTION, MULTIPLE_CHOICE_WITH_IMAGE_QUESTION, MULTI_SELECT_QUESTION, and
   * MULTI_SELECT_WITH_IMAGE_QUESTION question types.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasOther() {
    return hasOther;
  }

  /**
   * Option to allow open-ended text box for multi and multi-select question types. This can be used
   * with MULTIPLE_CHOICE_QUESTION, MULTIPLE_CHOICE_WITH_IMAGE_QUESTION, MULTI_SELECT_QUESTION, and
   * MULTI_SELECT_WITH_IMAGE_QUESTION question types.
   * @param hasOther hasOther or {@code null} for none
   */
  public SurveyQuestion setHasOther(java.lang.Boolean hasOther) {
    this.hasOther = hasOther;
    return this;
  }

  /**
   * For rating questions, the text for the higher end of the scale, such as 'Best'. For numeric
   * questions, a string representing a floating-point that is the maximum allowed number for a
   * response.
   * @return value or {@code null} for none
   */
  public java.lang.String getHighValueLabel() {
    return highValueLabel;
  }

  /**
   * For rating questions, the text for the higher end of the scale, such as 'Best'. For numeric
   * questions, a string representing a floating-point that is the maximum allowed number for a
   * response.
   * @param highValueLabel highValueLabel or {@code null} for none
   */
  public SurveyQuestion setHighValueLabel(java.lang.String highValueLabel) {
    this.highValueLabel = highValueLabel;
    return this;
  }

  /**
   * The alt_text property is required for image question types.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageAltText() {
    return imageAltText;
  }

  /**
   * The alt_text property is required for image question types.
   * @param imageAltText imageAltText or {@code null} for none
   */
  public SurveyQuestion setImageAltText(java.lang.String imageAltText) {
    this.imageAltText = imageAltText;
    return this;
  }

  /**
   * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question types. Maximum size
   * of 5MB.
   * @see #decodeImageData()
   * @return value or {@code null} for none
   */
  public java.lang.String getImageData() {
    return imageData;
  }

  /**
   * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question types. Maximum size
   * of 5MB.
   * @see #getImageData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeImageData() {
    return com.google.api.client.util.Base64.decodeBase64(imageData);
  }

  /**
   * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question types. Maximum size
   * of 5MB.
   * @see #encodeImageData()
   * @param imageData imageData or {@code null} for none
   */
  public SurveyQuestion setImageData(java.lang.String imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Inline jpeg, gif, tiff, bmp, or png image raw bytes for an image question types. Maximum size
   * of 5MB.
   * @see #setImageData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public SurveyQuestion encodeImageData(byte[] imageData) {
    this.imageData = com.google.api.client.util.Base64.encodeBase64URLSafeString(imageData);
    return this;
  }

  /**
   * Currently only support pinning an answer option to the last position.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLastAnswerPositionPinned() {
    return lastAnswerPositionPinned;
  }

  /**
   * Currently only support pinning an answer option to the last position.
   * @param lastAnswerPositionPinned lastAnswerPositionPinned or {@code null} for none
   */
  public SurveyQuestion setLastAnswerPositionPinned(java.lang.Boolean lastAnswerPositionPinned) {
    this.lastAnswerPositionPinned = lastAnswerPositionPinned;
    return this;
  }

  /**
   * For rating questions, the text for the lower end of the scale, such as 'Worst'. For numeric
   * questions, a string representing a floating-point that is the minimum allowed number for a
   * response.
   * @return value or {@code null} for none
   */
  public java.lang.String getLowValueLabel() {
    return lowValueLabel;
  }

  /**
   * For rating questions, the text for the lower end of the scale, such as 'Worst'. For numeric
   * questions, a string representing a floating-point that is the minimum allowed number for a
   * response.
   * @param lowValueLabel lowValueLabel or {@code null} for none
   */
  public SurveyQuestion setLowValueLabel(java.lang.String lowValueLabel) {
    this.lowValueLabel = lowValueLabel;
    return this;
  }

  /**
   * The number of answers to be displayed for a multiple choice question. If not set, it is the
   * number of answers. If set, the answers shown are chosen randomly.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumAnswersDisplayed() {
    return numAnswersDisplayed;
  }

  /**
   * The number of answers to be displayed for a multiple choice question. If not set, it is the
   * number of answers. If set, the answers shown are chosen randomly.
   * @param numAnswersDisplayed numAnswersDisplayed or {@code null} for none
   */
  public SurveyQuestion setNumAnswersDisplayed(java.lang.Integer numAnswersDisplayed) {
    this.numAnswersDisplayed = numAnswersDisplayed;
    return this;
  }

  /**
   * Number of stars to use for ratings questions.
   * @return value or {@code null} for none
   */
  public java.lang.String getNumStars() {
    return numStars;
  }

  /**
   * Number of stars to use for ratings questions.
   * @param numStars numStars or {@code null} for none
   */
  public SurveyQuestion setNumStars(java.lang.String numStars) {
    this.numStars = numStars;
    return this;
  }

  /**
   * Placeholder text for an open text question.
   * @return value or {@code null} for none
   */
  public java.lang.String getOpenTextPlaceholder() {
    return openTextPlaceholder;
  }

  /**
   * Placeholder text for an open text question.
   * @param openTextPlaceholder openTextPlaceholder or {@code null} for none
   */
  public SurveyQuestion setOpenTextPlaceholder(java.lang.String openTextPlaceholder) {
    this.openTextPlaceholder = openTextPlaceholder;
    return this;
  }

  /**
   * A list of suggested answers for open text question auto-complete.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOpenTextSuggestions() {
    return openTextSuggestions;
  }

  /**
   * A list of suggested answers for open text question auto-complete.
   * @param openTextSuggestions openTextSuggestions or {@code null} for none
   */
  public SurveyQuestion setOpenTextSuggestions(java.util.List<java.lang.String> openTextSuggestions) {
    this.openTextSuggestions = openTextSuggestions;
    return this;
  }

  /**
   * Required question text shown to the respondent.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuestion() {
    return question;
  }

  /**
   * Required question text shown to the respondent.
   * @param question question or {@code null} for none
   */
  public SurveyQuestion setQuestion(java.lang.String question) {
    this.question = question;
    return this;
  }

  /**
   * Option to allow multiple line open text responses instead of a single line response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleLineResponse() {
    return singleLineResponse;
  }

  /**
   * Option to allow multiple line open text responses instead of a single line response.
   * @param singleLineResponse singleLineResponse or {@code null} for none
   */
  public SurveyQuestion setSingleLineResponse(java.lang.Boolean singleLineResponse) {
    this.singleLineResponse = singleLineResponse;
    return this;
  }

  /**
   * The threshold/screener answer options, which will screen a user into the rest of the survey.
   * These will be a subset of the answer option strings.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getThresholdAnswers() {
    return thresholdAnswers;
  }

  /**
   * The threshold/screener answer options, which will screen a user into the rest of the survey.
   * These will be a subset of the answer option strings.
   * @param thresholdAnswers thresholdAnswers or {@code null} for none
   */
  public SurveyQuestion setThresholdAnswers(java.util.List<java.lang.String> thresholdAnswers) {
    this.thresholdAnswers = thresholdAnswers;
    return this;
  }

  /**
   * Required field defining the question type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required field defining the question type.
   * @param type type or {@code null} for none
   */
  public SurveyQuestion setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Optional unit of measurement for display (ie. hours, people, miles).
   * @return value or {@code null} for none
   */
  public java.lang.String getUnitOfMeasurementLabel() {
    return unitOfMeasurementLabel;
  }

  /**
   * Optional unit of measurement for display (ie. hours, people, miles).
   * @param unitOfMeasurementLabel unitOfMeasurementLabel or {@code null} for none
   */
  public SurveyQuestion setUnitOfMeasurementLabel(java.lang.String unitOfMeasurementLabel) {
    this.unitOfMeasurementLabel = unitOfMeasurementLabel;
    return this;
  }

  /**
   * Where the unit_of_measurement string should appear in relation to the input field.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnitsPosition() {
    return unitsPosition;
  }

  /**
   * Where the unit_of_measurement string should appear in relation to the input field.
   * @param unitsPosition unitsPosition or {@code null} for none
   */
  public SurveyQuestion setUnitsPosition(java.lang.String unitsPosition) {
    this.unitsPosition = unitsPosition;
    return this;
  }

  /**
   * The youtube video id to be show in video questions.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoId() {
    return videoId;
  }

  /**
   * The youtube video id to be show in video questions.
   * @param videoId videoId or {@code null} for none
   */
  public SurveyQuestion setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  @Override
  public SurveyQuestion set(String fieldName, Object value) {
    return (SurveyQuestion) super.set(fieldName, value);
  }

  @Override
  public SurveyQuestion clone() {
    return (SurveyQuestion) super.clone();
  }

}
