// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReposRepoDomainList {
    /**
     * @return Domain of internal endpoint, only in some regions.
     * 
     */
    private String internal;
    /**
     * @return Domain of public endpoint.
     * 
     */
    private String public_;
    /**
     * @return Domain of vpc endpoint.
     * 
     */
    private String vpc;

    private GetReposRepoDomainList() {}
    /**
     * @return Domain of internal endpoint, only in some regions.
     * 
     */
    public String internal() {
        return this.internal;
    }
    /**
     * @return Domain of public endpoint.
     * 
     */
    public String public_() {
        return this.public_;
    }
    /**
     * @return Domain of vpc endpoint.
     * 
     */
    public String vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReposRepoDomainList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String internal;
        private String public_;
        private String vpc;
        public Builder() {}
        public Builder(GetReposRepoDomainList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internal = defaults.internal;
    	      this.public_ = defaults.public_;
    	      this.vpc = defaults.vpc;
        }

        @CustomType.Setter
        public Builder internal(String internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(String public_) {
            this.public_ = Objects.requireNonNull(public_);
            return this;
        }
        @CustomType.Setter
        public Builder vpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public GetReposRepoDomainList build() {
            final var _resultValue = new GetReposRepoDomainList();
            _resultValue.internal = internal;
            _resultValue.public_ = public_;
            _resultValue.vpc = vpc;
            return _resultValue;
        }
    }
}
