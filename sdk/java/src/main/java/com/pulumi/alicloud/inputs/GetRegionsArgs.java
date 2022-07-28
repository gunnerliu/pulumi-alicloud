// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsArgs Empty = new GetRegionsArgs();

    /**
     * Set to true to match only the region configured in the provider.
     * 
     */
    @Import(name="current")
    private @Nullable Output<Boolean> current;

    /**
     * @return Set to true to match only the region configured in the provider.
     * 
     */
    public Optional<Output<Boolean>> current() {
        return Optional.ofNullable(this.current);
    }

    /**
     * The name of the region to select, such as `eu-central-1`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the region to select, such as `eu-central-1`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetRegionsArgs() {}

    private GetRegionsArgs(GetRegionsArgs $) {
        this.current = $.current;
        this.name = $.name;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsArgs $;

        public Builder() {
            $ = new GetRegionsArgs();
        }

        public Builder(GetRegionsArgs defaults) {
            $ = new GetRegionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param current Set to true to match only the region configured in the provider.
         * 
         * @return builder
         * 
         */
        public Builder current(@Nullable Output<Boolean> current) {
            $.current = current;
            return this;
        }

        /**
         * @param current Set to true to match only the region configured in the provider.
         * 
         * @return builder
         * 
         */
        public Builder current(Boolean current) {
            return current(Output.of(current));
        }

        /**
         * @param name The name of the region to select, such as `eu-central-1`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the region to select, such as `eu-central-1`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetRegionsArgs build() {
            return $;
        }
    }

}
