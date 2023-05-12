// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiConstantParameter {
    /**
     * @return The description of the api. Defaults to null.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Request&#39;s parameter location; values: BODY, HEAD, QUERY, and PATH.
     * 
     */
    private final String in;
    /**
     * @return The name of the api gateway api. Defaults to null.
     * 
     */
    private final String name;
    /**
     * @return Constant parameter value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ApiConstantParameter(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("in") String in,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.description = description;
        this.in = in;
        this.name = name;
        this.value = value;
    }

    /**
     * @return The description of the api. Defaults to null.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Request&#39;s parameter location; values: BODY, HEAD, QUERY, and PATH.
     * 
     */
    public String in() {
        return this.in;
    }
    /**
     * @return The name of the api gateway api. Defaults to null.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Constant parameter value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConstantParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String in;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConstantParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.in = defaults.in;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder in(String in) {
            this.in = Objects.requireNonNull(in);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ApiConstantParameter build() {
            return new ApiConstantParameter(description, in, name, value);
        }
    }
}
