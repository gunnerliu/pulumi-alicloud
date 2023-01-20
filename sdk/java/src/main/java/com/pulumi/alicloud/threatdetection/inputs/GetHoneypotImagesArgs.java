// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHoneypotImagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHoneypotImagesArgs Empty = new GetHoneypotImagesArgs();

    /**
     * A list of Honeypot Image IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Honeypot Image IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Honeypot mirror nam.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Honeypot mirror nam.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetHoneypotImagesArgs() {}

    private GetHoneypotImagesArgs(GetHoneypotImagesArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.nodeId = $.nodeId;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHoneypotImagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHoneypotImagesArgs $;

        public Builder() {
            $ = new GetHoneypotImagesArgs();
        }

        public Builder(GetHoneypotImagesArgs defaults) {
            $ = new GetHoneypotImagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Honeypot Image IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Honeypot Image IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Honeypot Image IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Honeypot mirror nam.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Honeypot mirror nam.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetHoneypotImagesArgs build() {
            return $;
        }
    }

}
