// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAlertContactsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertContactsPlainArgs Empty = new GetAlertContactsPlainArgs();

    /**
     * The name of the alert contact.
     * 
     */
    @Import(name="alertContactName")
    private @Nullable String alertContactName;

    /**
     * @return The name of the alert contact.
     * 
     */
    public Optional<String> alertContactName() {
        return Optional.ofNullable(this.alertContactName);
    }

    /**
     * The email address of the alert contact.
     * 
     */
    @Import(name="email")
    private @Nullable String email;

    /**
     * @return The email address of the alert contact.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * A list of Alert Contact IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Alert Contact IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Alert Contact name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Alert Contact name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The mobile number of the alert contact.
     * 
     */
    @Import(name="phoneNum")
    private @Nullable String phoneNum;

    /**
     * @return The mobile number of the alert contact.
     * 
     */
    public Optional<String> phoneNum() {
        return Optional.ofNullable(this.phoneNum);
    }

    private GetAlertContactsPlainArgs() {}

    private GetAlertContactsPlainArgs(GetAlertContactsPlainArgs $) {
        this.alertContactName = $.alertContactName;
        this.email = $.email;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.phoneNum = $.phoneNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertContactsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertContactsPlainArgs $;

        public Builder() {
            $ = new GetAlertContactsPlainArgs();
        }

        public Builder(GetAlertContactsPlainArgs defaults) {
            $ = new GetAlertContactsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContactName The name of the alert contact.
         * 
         * @return builder
         * 
         */
        public Builder alertContactName(@Nullable String alertContactName) {
            $.alertContactName = alertContactName;
            return this;
        }

        /**
         * @param email The email address of the alert contact.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable String email) {
            $.email = email;
            return this;
        }

        /**
         * @param ids A list of Alert Contact IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Alert Contact IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Alert Contact name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param phoneNum The mobile number of the alert contact.
         * 
         * @return builder
         * 
         */
        public Builder phoneNum(@Nullable String phoneNum) {
            $.phoneNum = phoneNum;
            return this;
        }

        public GetAlertContactsPlainArgs build() {
            return $;
        }
    }

}
