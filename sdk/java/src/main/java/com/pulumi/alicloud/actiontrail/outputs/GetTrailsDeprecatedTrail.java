// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTrailsDeprecatedTrail {
    /**
     * @return Indicates whether the event is a read or a write event.
     * 
     */
    private String eventRw;
    private String id;
    private Boolean isOrganizationTrail;
    /**
     * @return The name of the specified OSS bucket.
     * 
     */
    private String ossBucketName;
    /**
     * @return The prefix of the specified OSS bucket name.
     * 
     */
    private String ossKeyPrefix;
    private String ossWriteRoleArn;
    /**
     * @return The unique ARN of the Log Service project.
     * 
     */
    private String slsProjectArn;
    /**
     * @return The unique ARN of the Log Service role.
     * 
     */
    private String slsWriteRoleArn;
    private String status;
    private String trailName;
    private String trailRegion;

    private GetTrailsDeprecatedTrail() {}
    /**
     * @return Indicates whether the event is a read or a write event.
     * 
     */
    public String eventRw() {
        return this.eventRw;
    }
    public String id() {
        return this.id;
    }
    public Boolean isOrganizationTrail() {
        return this.isOrganizationTrail;
    }
    /**
     * @return The name of the specified OSS bucket.
     * 
     */
    public String ossBucketName() {
        return this.ossBucketName;
    }
    /**
     * @return The prefix of the specified OSS bucket name.
     * 
     */
    public String ossKeyPrefix() {
        return this.ossKeyPrefix;
    }
    public String ossWriteRoleArn() {
        return this.ossWriteRoleArn;
    }
    /**
     * @return The unique ARN of the Log Service project.
     * 
     */
    public String slsProjectArn() {
        return this.slsProjectArn;
    }
    /**
     * @return The unique ARN of the Log Service role.
     * 
     */
    public String slsWriteRoleArn() {
        return this.slsWriteRoleArn;
    }
    public String status() {
        return this.status;
    }
    public String trailName() {
        return this.trailName;
    }
    public String trailRegion() {
        return this.trailRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrailsDeprecatedTrail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String eventRw;
        private String id;
        private Boolean isOrganizationTrail;
        private String ossBucketName;
        private String ossKeyPrefix;
        private String ossWriteRoleArn;
        private String slsProjectArn;
        private String slsWriteRoleArn;
        private String status;
        private String trailName;
        private String trailRegion;
        public Builder() {}
        public Builder(GetTrailsDeprecatedTrail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventRw = defaults.eventRw;
    	      this.id = defaults.id;
    	      this.isOrganizationTrail = defaults.isOrganizationTrail;
    	      this.ossBucketName = defaults.ossBucketName;
    	      this.ossKeyPrefix = defaults.ossKeyPrefix;
    	      this.ossWriteRoleArn = defaults.ossWriteRoleArn;
    	      this.slsProjectArn = defaults.slsProjectArn;
    	      this.slsWriteRoleArn = defaults.slsWriteRoleArn;
    	      this.status = defaults.status;
    	      this.trailName = defaults.trailName;
    	      this.trailRegion = defaults.trailRegion;
        }

        @CustomType.Setter
        public Builder eventRw(String eventRw) {
            this.eventRw = Objects.requireNonNull(eventRw);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
            this.isOrganizationTrail = Objects.requireNonNull(isOrganizationTrail);
            return this;
        }
        @CustomType.Setter
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = Objects.requireNonNull(ossBucketName);
            return this;
        }
        @CustomType.Setter
        public Builder ossKeyPrefix(String ossKeyPrefix) {
            this.ossKeyPrefix = Objects.requireNonNull(ossKeyPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder ossWriteRoleArn(String ossWriteRoleArn) {
            this.ossWriteRoleArn = Objects.requireNonNull(ossWriteRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder slsProjectArn(String slsProjectArn) {
            this.slsProjectArn = Objects.requireNonNull(slsProjectArn);
            return this;
        }
        @CustomType.Setter
        public Builder slsWriteRoleArn(String slsWriteRoleArn) {
            this.slsWriteRoleArn = Objects.requireNonNull(slsWriteRoleArn);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder trailName(String trailName) {
            this.trailName = Objects.requireNonNull(trailName);
            return this;
        }
        @CustomType.Setter
        public Builder trailRegion(String trailRegion) {
            this.trailRegion = Objects.requireNonNull(trailRegion);
            return this;
        }
        public GetTrailsDeprecatedTrail build() {
            final var _resultValue = new GetTrailsDeprecatedTrail();
            _resultValue.eventRw = eventRw;
            _resultValue.id = id;
            _resultValue.isOrganizationTrail = isOrganizationTrail;
            _resultValue.ossBucketName = ossBucketName;
            _resultValue.ossKeyPrefix = ossKeyPrefix;
            _resultValue.ossWriteRoleArn = ossWriteRoleArn;
            _resultValue.slsProjectArn = slsProjectArn;
            _resultValue.slsWriteRoleArn = slsWriteRoleArn;
            _resultValue.status = status;
            _resultValue.trailName = trailName;
            _resultValue.trailRegion = trailRegion;
            return _resultValue;
        }
    }
}
