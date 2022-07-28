// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDbClustersClusterScaleOutStatus {
    /**
     * @return Process.
     * 
     */
    private final String progress;
    /**
     * @return Efficiency.
     * 
     */
    private final String ratio;

    @CustomType.Constructor
    private GetDbClustersClusterScaleOutStatus(
        @CustomType.Parameter("progress") String progress,
        @CustomType.Parameter("ratio") String ratio) {
        this.progress = progress;
        this.ratio = ratio;
    }

    /**
     * @return Process.
     * 
     */
    public String progress() {
        return this.progress;
    }
    /**
     * @return Efficiency.
     * 
     */
    public String ratio() {
        return this.ratio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbClustersClusterScaleOutStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String progress;
        private String ratio;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDbClustersClusterScaleOutStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.progress = defaults.progress;
    	      this.ratio = defaults.ratio;
        }

        public Builder progress(String progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        public Builder ratio(String ratio) {
            this.ratio = Objects.requireNonNull(ratio);
            return this;
        }        public GetDbClustersClusterScaleOutStatus build() {
            return new GetDbClustersClusterScaleOutStatus(progress, ratio);
        }
    }
}
