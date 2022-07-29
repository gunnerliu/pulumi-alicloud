// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackParameterArgs Empty = new StackParameterArgs();

    /**
     * The parameter key.
     * 
     */
    @Import(name="parameterKey")
    private @Nullable Output<String> parameterKey;

    /**
     * @return The parameter key.
     * 
     */
    public Optional<Output<String>> parameterKey() {
        return Optional.ofNullable(this.parameterKey);
    }

    /**
     * The parameter value.
     * 
     */
    @Import(name="parameterValue", required=true)
    private Output<String> parameterValue;

    /**
     * @return The parameter value.
     * 
     */
    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    private StackParameterArgs() {}

    private StackParameterArgs(StackParameterArgs $) {
        this.parameterKey = $.parameterKey;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackParameterArgs $;

        public Builder() {
            $ = new StackParameterArgs();
        }

        public Builder(StackParameterArgs defaults) {
            $ = new StackParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameterKey The parameter key.
         * 
         * @return builder
         * 
         */
        public Builder parameterKey(@Nullable Output<String> parameterKey) {
            $.parameterKey = parameterKey;
            return this;
        }

        /**
         * @param parameterKey The parameter key.
         * 
         * @return builder
         * 
         */
        public Builder parameterKey(String parameterKey) {
            return parameterKey(Output.of(parameterKey));
        }

        /**
         * @param parameterValue The parameter value.
         * 
         * @return builder
         * 
         */
        public Builder parameterValue(Output<String> parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        /**
         * @param parameterValue The parameter value.
         * 
         * @return builder
         * 
         */
        public Builder parameterValue(String parameterValue) {
            return parameterValue(Output.of(parameterValue));
        }

        public StackParameterArgs build() {
            $.parameterValue = Objects.requireNonNull($.parameterValue, "expected parameter 'parameterValue' to be non-null");
            return $;
        }
    }

}
