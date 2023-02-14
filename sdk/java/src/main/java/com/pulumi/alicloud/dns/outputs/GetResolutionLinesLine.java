// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResolutionLinesLine {
    private String lineCode;
    /**
     * @return Line display name.
     * 
     */
    private String lineDisplayName;
    /**
     * @return Line name.
     * 
     */
    private String lineName;

    private GetResolutionLinesLine() {}
    public String lineCode() {
        return this.lineCode;
    }
    /**
     * @return Line display name.
     * 
     */
    public String lineDisplayName() {
        return this.lineDisplayName;
    }
    /**
     * @return Line name.
     * 
     */
    public String lineName() {
        return this.lineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolutionLinesLine defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String lineCode;
        private String lineDisplayName;
        private String lineName;
        public Builder() {}
        public Builder(GetResolutionLinesLine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lineCode = defaults.lineCode;
    	      this.lineDisplayName = defaults.lineDisplayName;
    	      this.lineName = defaults.lineName;
        }

        @CustomType.Setter
        public Builder lineCode(String lineCode) {
            this.lineCode = Objects.requireNonNull(lineCode);
            return this;
        }
        @CustomType.Setter
        public Builder lineDisplayName(String lineDisplayName) {
            this.lineDisplayName = Objects.requireNonNull(lineDisplayName);
            return this;
        }
        @CustomType.Setter
        public Builder lineName(String lineName) {
            this.lineName = Objects.requireNonNull(lineName);
            return this;
        }
        public GetResolutionLinesLine build() {
            final var o = new GetResolutionLinesLine();
            o.lineCode = lineCode;
            o.lineDisplayName = lineDisplayName;
            o.lineName = lineName;
            return o;
        }
    }
}