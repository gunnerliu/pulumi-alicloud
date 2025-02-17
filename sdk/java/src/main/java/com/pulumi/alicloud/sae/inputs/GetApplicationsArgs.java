// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationsArgs Empty = new GetApplicationsArgs();

    /**
     * Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
     * 
     */
    @Import(name="appName")
    private @Nullable Output<String> appName;

    /**
     * @return Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
     * 
     */
    public Optional<Output<String>> appName() {
        return Optional.ofNullable(this.appName);
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
     * 
     */
    @Import(name="fieldType")
    private @Nullable Output<String> fieldType;

    /**
     * @return The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
     * 
     */
    public Optional<Output<String>> fieldType() {
        return Optional.ofNullable(this.fieldType);
    }

    /**
     * The field value.
     * 
     */
    @Import(name="fieldValue")
    private @Nullable Output<String> fieldValue;

    /**
     * @return The field value.
     * 
     */
    public Optional<Output<String>> fieldValue() {
        return Optional.ofNullable(this.fieldValue);
    }

    /**
     * A list of Application IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Application IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The order by.Valid values:`running`,`instances`.
     * 
     */
    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    /**
     * @return The order by.Valid values:`running`,`instances`.
     * 
     */
    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The reverse.
     * 
     */
    @Import(name="reverse")
    private @Nullable Output<Boolean> reverse;

    /**
     * @return The reverse.
     * 
     */
    public Optional<Output<Boolean>> reverse() {
        return Optional.ofNullable(this.reverse);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetApplicationsArgs() {}

    private GetApplicationsArgs(GetApplicationsArgs $) {
        this.appName = $.appName;
        this.enableDetails = $.enableDetails;
        this.fieldType = $.fieldType;
        this.fieldValue = $.fieldValue;
        this.ids = $.ids;
        this.namespaceId = $.namespaceId;
        this.orderBy = $.orderBy;
        this.outputFile = $.outputFile;
        this.reverse = $.reverse;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationsArgs $;

        public Builder() {
            $ = new GetApplicationsArgs();
        }

        public Builder(GetApplicationsArgs defaults) {
            $ = new GetApplicationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appName Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
         * 
         * @return builder
         * 
         */
        public Builder appName(@Nullable Output<String> appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appName Application Name. Combinations of numbers, letters, and dashes (-) are allowed. It must start with a letter and the maximum length is 36 characters.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param fieldType The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
         * 
         * @return builder
         * 
         */
        public Builder fieldType(@Nullable Output<String> fieldType) {
            $.fieldType = fieldType;
            return this;
        }

        /**
         * @param fieldType The field type. Valid values:`appName`, `appIds`, `slbIps`, `instanceIps`
         * 
         * @return builder
         * 
         */
        public Builder fieldType(String fieldType) {
            return fieldType(Output.of(fieldType));
        }

        /**
         * @param fieldValue The field value.
         * 
         * @return builder
         * 
         */
        public Builder fieldValue(@Nullable Output<String> fieldValue) {
            $.fieldValue = fieldValue;
            return this;
        }

        /**
         * @param fieldValue The field value.
         * 
         * @return builder
         * 
         */
        public Builder fieldValue(String fieldValue) {
            return fieldValue(Output.of(fieldValue));
        }

        /**
         * @param ids A list of Application IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Application IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Application IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param namespaceId SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId SAE namespace ID. Only namespaces whose names are lowercase letters and dashes (-) are supported, and must start with a letter. The namespace can be obtained by calling the DescribeNamespaceList interface.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param orderBy The order by.Valid values:`running`,`instances`.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param orderBy The order by.Valid values:`running`,`instances`.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param reverse The reverse.
         * 
         * @return builder
         * 
         */
        public Builder reverse(@Nullable Output<Boolean> reverse) {
            $.reverse = reverse;
            return this;
        }

        /**
         * @param reverse The reverse.
         * 
         * @return builder
         * 
         */
        public Builder reverse(Boolean reverse) {
            return reverse(Output.of(reverse));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetApplicationsArgs build() {
            return $;
        }
    }

}
