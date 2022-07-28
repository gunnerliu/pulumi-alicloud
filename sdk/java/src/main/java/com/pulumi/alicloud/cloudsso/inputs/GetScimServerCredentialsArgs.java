// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScimServerCredentialsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScimServerCredentialsArgs Empty = new GetScimServerCredentialsArgs();

    /**
     * The ID of the Directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The ID of the Directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    /**
     * A list of SCIM Server Credential IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of SCIM Server Credential IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The Status of the resource. Valid values: `Disabled`, `Enabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The Status of the resource. Valid values: `Disabled`, `Enabled`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetScimServerCredentialsArgs() {}

    private GetScimServerCredentialsArgs(GetScimServerCredentialsArgs $) {
        this.directoryId = $.directoryId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScimServerCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScimServerCredentialsArgs $;

        public Builder() {
            $ = new GetScimServerCredentialsArgs();
        }

        public Builder(GetScimServerCredentialsArgs defaults) {
            $ = new GetScimServerCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param ids A list of SCIM Server Credential IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of SCIM Server Credential IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of SCIM Server Credential IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status The Status of the resource. Valid values: `Disabled`, `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The Status of the resource. Valid values: `Disabled`, `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetScimServerCredentialsArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            return $;
        }
    }

}
