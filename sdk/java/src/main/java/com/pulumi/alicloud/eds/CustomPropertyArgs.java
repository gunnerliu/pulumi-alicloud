// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.alicloud.eds.inputs.CustomPropertyPropertyValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomPropertyArgs Empty = new CustomPropertyArgs();

    /**
     * The Custom attribute key.
     * 
     */
    @Import(name="propertyKey", required=true)
    private Output<String> propertyKey;

    /**
     * @return The Custom attribute key.
     * 
     */
    public Output<String> propertyKey() {
        return this.propertyKey;
    }

    /**
     * Custom attribute sets the value of. See the following `Block property_values`.
     * 
     */
    @Import(name="propertyValues")
    private @Nullable Output<List<CustomPropertyPropertyValueArgs>> propertyValues;

    /**
     * @return Custom attribute sets the value of. See the following `Block property_values`.
     * 
     */
    public Optional<Output<List<CustomPropertyPropertyValueArgs>>> propertyValues() {
        return Optional.ofNullable(this.propertyValues);
    }

    private CustomPropertyArgs() {}

    private CustomPropertyArgs(CustomPropertyArgs $) {
        this.propertyKey = $.propertyKey;
        this.propertyValues = $.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomPropertyArgs $;

        public Builder() {
            $ = new CustomPropertyArgs();
        }

        public Builder(CustomPropertyArgs defaults) {
            $ = new CustomPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param propertyKey The Custom attribute key.
         * 
         * @return builder
         * 
         */
        public Builder propertyKey(Output<String> propertyKey) {
            $.propertyKey = propertyKey;
            return this;
        }

        /**
         * @param propertyKey The Custom attribute key.
         * 
         * @return builder
         * 
         */
        public Builder propertyKey(String propertyKey) {
            return propertyKey(Output.of(propertyKey));
        }

        /**
         * @param propertyValues Custom attribute sets the value of. See the following `Block property_values`.
         * 
         * @return builder
         * 
         */
        public Builder propertyValues(@Nullable Output<List<CustomPropertyPropertyValueArgs>> propertyValues) {
            $.propertyValues = propertyValues;
            return this;
        }

        /**
         * @param propertyValues Custom attribute sets the value of. See the following `Block property_values`.
         * 
         * @return builder
         * 
         */
        public Builder propertyValues(List<CustomPropertyPropertyValueArgs> propertyValues) {
            return propertyValues(Output.of(propertyValues));
        }

        /**
         * @param propertyValues Custom attribute sets the value of. See the following `Block property_values`.
         * 
         * @return builder
         * 
         */
        public Builder propertyValues(CustomPropertyPropertyValueArgs... propertyValues) {
            return propertyValues(List.of(propertyValues));
        }

        public CustomPropertyArgs build() {
            $.propertyKey = Objects.requireNonNull($.propertyKey, "expected parameter 'propertyKey' to be non-null");
            return $;
        }
    }

}