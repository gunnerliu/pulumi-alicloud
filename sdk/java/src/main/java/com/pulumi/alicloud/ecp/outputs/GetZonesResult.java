// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecp.outputs;

import com.pulumi.alicloud.ecp.outputs.GetZonesZone;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetZonesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String outputFile;
    private final List<GetZonesZone> zones;

    @CustomType.Constructor
    private GetZonesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("zones") List<GetZonesZone> zones) {
        this.id = id;
        this.outputFile = outputFile;
        this.zones = zones;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetZonesZone> zones() {
        return this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZonesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String outputFile;
        private List<GetZonesZone> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZonesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
    	      this.zones = defaults.zones;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder zones(List<GetZonesZone> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public Builder zones(GetZonesZone... zones) {
            return zones(List.of(zones));
        }        public GetZonesResult build() {
            return new GetZonesResult(id, outputFile, zones);
        }
    }
}
