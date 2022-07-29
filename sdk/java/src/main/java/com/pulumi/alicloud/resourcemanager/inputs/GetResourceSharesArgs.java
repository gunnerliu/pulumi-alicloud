// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceSharesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceSharesArgs Empty = new GetResourceSharesArgs();

    /**
     * A list of Resource Share IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Resource Share IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Resource Share name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Resource Share name.
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
     * The name of resource share.
     * 
     */
    @Import(name="resourceShareName")
    private @Nullable Output<String> resourceShareName;

    /**
     * @return The name of resource share.
     * 
     */
    public Optional<Output<String>> resourceShareName() {
        return Optional.ofNullable(this.resourceShareName);
    }

    /**
     * The owner of resource share.
     * 
     */
    @Import(name="resourceShareOwner", required=true)
    private Output<String> resourceShareOwner;

    /**
     * @return The owner of resource share.
     * 
     */
    public Output<String> resourceShareOwner() {
        return this.resourceShareOwner;
    }

    /**
     * The status of resource share.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of resource share.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetResourceSharesArgs() {}

    private GetResourceSharesArgs(GetResourceSharesArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceShareName = $.resourceShareName;
        this.resourceShareOwner = $.resourceShareOwner;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceSharesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceSharesArgs $;

        public Builder() {
            $ = new GetResourceSharesArgs();
        }

        public Builder(GetResourceSharesArgs defaults) {
            $ = new GetResourceSharesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Resource Share IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Resource Share IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Resource Share IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Resource Share name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Resource Share name.
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
         * @param resourceShareName The name of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareName(@Nullable Output<String> resourceShareName) {
            $.resourceShareName = resourceShareName;
            return this;
        }

        /**
         * @param resourceShareName The name of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareName(String resourceShareName) {
            return resourceShareName(Output.of(resourceShareName));
        }

        /**
         * @param resourceShareOwner The owner of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareOwner(Output<String> resourceShareOwner) {
            $.resourceShareOwner = resourceShareOwner;
            return this;
        }

        /**
         * @param resourceShareOwner The owner of resource share.
         * 
         * @return builder
         * 
         */
        public Builder resourceShareOwner(String resourceShareOwner) {
            return resourceShareOwner(Output.of(resourceShareOwner));
        }

        /**
         * @param status The status of resource share.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of resource share.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetResourceSharesArgs build() {
            $.resourceShareOwner = Objects.requireNonNull($.resourceShareOwner, "expected parameter 'resourceShareOwner' to be non-null");
            return $;
        }
    }

}
