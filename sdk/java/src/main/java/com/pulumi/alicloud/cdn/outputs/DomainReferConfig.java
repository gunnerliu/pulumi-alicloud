// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainReferConfig {
    private @Nullable String allowEmpty;
    private List<String> referLists;
    private @Nullable String referType;

    private DomainReferConfig() {}
    public Optional<String> allowEmpty() {
        return Optional.ofNullable(this.allowEmpty);
    }
    public List<String> referLists() {
        return this.referLists;
    }
    public Optional<String> referType() {
        return Optional.ofNullable(this.referType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainReferConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allowEmpty;
        private List<String> referLists;
        private @Nullable String referType;
        public Builder() {}
        public Builder(DomainReferConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowEmpty = defaults.allowEmpty;
    	      this.referLists = defaults.referLists;
    	      this.referType = defaults.referType;
        }

        @CustomType.Setter
        public Builder allowEmpty(@Nullable String allowEmpty) {
            this.allowEmpty = allowEmpty;
            return this;
        }
        @CustomType.Setter
        public Builder referLists(List<String> referLists) {
            this.referLists = Objects.requireNonNull(referLists);
            return this;
        }
        public Builder referLists(String... referLists) {
            return referLists(List.of(referLists));
        }
        @CustomType.Setter
        public Builder referType(@Nullable String referType) {
            this.referType = referType;
            return this;
        }
        public DomainReferConfig build() {
            final var _resultValue = new DomainReferConfig();
            _resultValue.allowEmpty = allowEmpty;
            _resultValue.referLists = referLists;
            _resultValue.referType = referType;
            return _resultValue;
        }
    }
}
