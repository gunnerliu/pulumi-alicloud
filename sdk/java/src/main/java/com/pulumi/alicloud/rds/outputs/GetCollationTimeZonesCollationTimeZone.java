// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCollationTimeZonesCollationTimeZone {
    /**
     * @return The code of the instance type.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The offset of the UTC time. The offset is in the following format: (UTC+&lt;i&gt;HH:mm&lt;/i&gt;).
     * 
     */
    private final @Nullable String standardTimeOffset;
    /**
     * @return The time zone that is available for use in ApsaraDB RDS.
     * 
     */
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private GetCollationTimeZonesCollationTimeZone(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("standardTimeOffset") @Nullable String standardTimeOffset,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.description = description;
        this.standardTimeOffset = standardTimeOffset;
        this.timeZone = timeZone;
    }

    /**
     * @return The code of the instance type.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The offset of the UTC time. The offset is in the following format: (UTC+&lt;i&gt;HH:mm&lt;/i&gt;).
     * 
     */
    public Optional<String> standardTimeOffset() {
        return Optional.ofNullable(this.standardTimeOffset);
    }
    /**
     * @return The time zone that is available for use in ApsaraDB RDS.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCollationTimeZonesCollationTimeZone defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String standardTimeOffset;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCollationTimeZonesCollationTimeZone defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.standardTimeOffset = defaults.standardTimeOffset;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder standardTimeOffset(@Nullable String standardTimeOffset) {
            this.standardTimeOffset = standardTimeOffset;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public GetCollationTimeZonesCollationTimeZone build() {
            return new GetCollationTimeZonesCollationTimeZone(description, standardTimeOffset, timeZone);
        }
    }
}
