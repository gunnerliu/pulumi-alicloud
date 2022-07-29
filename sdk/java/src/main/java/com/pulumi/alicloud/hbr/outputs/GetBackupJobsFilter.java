// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackupJobsFilter {
    /**
     * @return The key of the field to filter. Valid values: `PlanId`, `VaultId`, `InstanceId`, `Bucket`, `FileSystemId`, `CompleteTime`.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The operator of the field to filter. Valid values: `EQUAL`, `NOT_EQUAL`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`, `IN`.
     * 
     */
    private final @Nullable String operator;
    /**
     * @return Set of values that are accepted for the given field.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private GetBackupJobsFilter(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    /**
     * @return The key of the field to filter. Valid values: `PlanId`, `VaultId`, `InstanceId`, `Bucket`, `FileSystemId`, `CompleteTime`.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The operator of the field to filter. Valid values: `EQUAL`, `NOT_EQUAL`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`, `IN`.
     * 
     */
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * @return Set of values that are accepted for the given field.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupJobsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String operator;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupJobsFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetBackupJobsFilter build() {
            return new GetBackupJobsFilter(key, operator, values);
        }
    }
}
