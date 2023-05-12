// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHoneypotPresetsPresetMeta {
    /**
     * @return Burp counter.
     * 
     */
    private final String burp;
    /**
     * @return Social traceability.
     * 
     */
    private final Boolean portraitOption;
    /**
     * @return Git countered.
     * 
     */
    private final String trojanGit;

    @CustomType.Constructor
    private GetHoneypotPresetsPresetMeta(
        @CustomType.Parameter("burp") String burp,
        @CustomType.Parameter("portraitOption") Boolean portraitOption,
        @CustomType.Parameter("trojanGit") String trojanGit) {
        this.burp = burp;
        this.portraitOption = portraitOption;
        this.trojanGit = trojanGit;
    }

    /**
     * @return Burp counter.
     * 
     */
    public String burp() {
        return this.burp;
    }
    /**
     * @return Social traceability.
     * 
     */
    public Boolean portraitOption() {
        return this.portraitOption;
    }
    /**
     * @return Git countered.
     * 
     */
    public String trojanGit() {
        return this.trojanGit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHoneypotPresetsPresetMeta defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String burp;
        private Boolean portraitOption;
        private String trojanGit;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHoneypotPresetsPresetMeta defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burp = defaults.burp;
    	      this.portraitOption = defaults.portraitOption;
    	      this.trojanGit = defaults.trojanGit;
        }

        public Builder burp(String burp) {
            this.burp = Objects.requireNonNull(burp);
            return this;
        }
        public Builder portraitOption(Boolean portraitOption) {
            this.portraitOption = Objects.requireNonNull(portraitOption);
            return this;
        }
        public Builder trojanGit(String trojanGit) {
            this.trojanGit = Objects.requireNonNull(trojanGit);
            return this;
        }        public GetHoneypotPresetsPresetMeta build() {
            return new GetHoneypotPresetsPresetMeta(burp, portraitOption, trojanGit);
        }
    }
}
