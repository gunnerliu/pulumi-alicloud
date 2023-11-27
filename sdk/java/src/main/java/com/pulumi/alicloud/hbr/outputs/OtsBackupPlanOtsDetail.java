// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OtsBackupPlanOtsDetail {
    /**
     * @return The names of the destination tables in the Tablestore instance. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    private @Nullable List<String> tableNames;

    private OtsBackupPlanOtsDetail() {}
    /**
     * @return The names of the destination tables in the Tablestore instance. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public List<String> tableNames() {
        return this.tableNames == null ? List.of() : this.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OtsBackupPlanOtsDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> tableNames;
        public Builder() {}
        public Builder(OtsBackupPlanOtsDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableNames = defaults.tableNames;
        }

        @CustomType.Setter
        public Builder tableNames(@Nullable List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public Builder tableNames(String... tableNames) {
            return tableNames(List.of(tableNames));
        }
        public OtsBackupPlanOtsDetail build() {
            final var _resultValue = new OtsBackupPlanOtsDetail();
            _resultValue.tableNames = tableNames;
            return _resultValue;
        }
    }
}
