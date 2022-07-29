// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyPairsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPairsArgs Empty = new GetKeyPairsArgs();

    /**
     * A finger print used to retrieve specified key pair.
     * 
     */
    @Import(name="fingerPrint")
    private @Nullable Output<String> fingerPrint;

    /**
     * @return A finger print used to retrieve specified key pair.
     * 
     */
    public Optional<Output<String>> fingerPrint() {
        return Optional.ofNullable(this.fingerPrint);
    }

    /**
     * A list of key pair IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of key pair IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to apply to the resulting key pairs.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to apply to the resulting key pairs.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The Id of resource group which the key pair belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the key pair belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetKeyPairsArgs() {}

    private GetKeyPairsArgs(GetKeyPairsArgs $) {
        this.fingerPrint = $.fingerPrint;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyPairsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyPairsArgs $;

        public Builder() {
            $ = new GetKeyPairsArgs();
        }

        public Builder(GetKeyPairsArgs defaults) {
            $ = new GetKeyPairsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fingerPrint A finger print used to retrieve specified key pair.
         * 
         * @return builder
         * 
         */
        public Builder fingerPrint(@Nullable Output<String> fingerPrint) {
            $.fingerPrint = fingerPrint;
            return this;
        }

        /**
         * @param fingerPrint A finger print used to retrieve specified key pair.
         * 
         * @return builder
         * 
         */
        public Builder fingerPrint(String fingerPrint) {
            return fingerPrint(Output.of(fingerPrint));
        }

        /**
         * @param ids A list of key pair IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of key pair IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of key pair IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to apply to the resulting key pairs.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the resulting key pairs.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param resourceGroupId The Id of resource group which the key pair belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which the key pair belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public GetKeyPairsArgs build() {
            return $;
        }
    }

}
