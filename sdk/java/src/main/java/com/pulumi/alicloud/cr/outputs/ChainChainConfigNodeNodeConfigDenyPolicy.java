// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChainChainConfigNodeNodeConfigDenyPolicy {
    /**
     * @return The action of trigger blocking. Valid values: `BLOCK`, `BLOCK_RETAG`, `BLOCK_DELETE_TAG`. While `Block` means block the delivery chain from continuing to execute, `BLOCK_RETAG` means block overwriting push image tag, `BLOCK_DELETE_TAG` means block deletion of mirror tags.
     * 
     */
    private @Nullable String action;
    /**
     * @return The count of scanning vulnerabilities that triggers blocking.
     * 
     */
    private @Nullable String issueCount;
    /**
     * @return The level of scanning vulnerability that triggers blocking. Valid values: `LOW`, `MEDIUM`, `HIGH`, `UNKNOWN`.
     * 
     */
    private @Nullable String issueLevel;
    /**
     * @return The logic of trigger blocking. Valid values: `AND`, `OR`.
     * 
     */
    private @Nullable String logic;

    private ChainChainConfigNodeNodeConfigDenyPolicy() {}
    /**
     * @return The action of trigger blocking. Valid values: `BLOCK`, `BLOCK_RETAG`, `BLOCK_DELETE_TAG`. While `Block` means block the delivery chain from continuing to execute, `BLOCK_RETAG` means block overwriting push image tag, `BLOCK_DELETE_TAG` means block deletion of mirror tags.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The count of scanning vulnerabilities that triggers blocking.
     * 
     */
    public Optional<String> issueCount() {
        return Optional.ofNullable(this.issueCount);
    }
    /**
     * @return The level of scanning vulnerability that triggers blocking. Valid values: `LOW`, `MEDIUM`, `HIGH`, `UNKNOWN`.
     * 
     */
    public Optional<String> issueLevel() {
        return Optional.ofNullable(this.issueLevel);
    }
    /**
     * @return The logic of trigger blocking. Valid values: `AND`, `OR`.
     * 
     */
    public Optional<String> logic() {
        return Optional.ofNullable(this.logic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainChainConfigNodeNodeConfigDenyPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable String issueCount;
        private @Nullable String issueLevel;
        private @Nullable String logic;
        public Builder() {}
        public Builder(ChainChainConfigNodeNodeConfigDenyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.issueCount = defaults.issueCount;
    	      this.issueLevel = defaults.issueLevel;
    	      this.logic = defaults.logic;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder issueCount(@Nullable String issueCount) {
            this.issueCount = issueCount;
            return this;
        }
        @CustomType.Setter
        public Builder issueLevel(@Nullable String issueLevel) {
            this.issueLevel = issueLevel;
            return this;
        }
        @CustomType.Setter
        public Builder logic(@Nullable String logic) {
            this.logic = logic;
            return this;
        }
        public ChainChainConfigNodeNodeConfigDenyPolicy build() {
            final var _resultValue = new ChainChainConfigNodeNodeConfigDenyPolicy();
            _resultValue.action = action;
            _resultValue.issueCount = issueCount;
            _resultValue.issueLevel = issueLevel;
            _resultValue.logic = logic;
            return _resultValue;
        }
    }
}
