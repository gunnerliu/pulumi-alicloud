// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.alicloud.actiontrail.outputs.GetTrailsDeprecatedActiontrail;
import com.pulumi.alicloud.actiontrail.outputs.GetTrailsDeprecatedTrail;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrailsDeprecatedResult {
    /**
     * @return A list of actiontrails. Each element contains the following attributes:
     * 
     * @deprecated
     * Field &#39;actiontrails&#39; has been deprecated from version 1.95.0. Use &#39;trails&#39; instead.
     * 
     */
    @Deprecated /* Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead. */
    private List<GetTrailsDeprecatedActiontrail> actiontrails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable Boolean includeOrganizationTrail;
    private @Nullable Boolean includeShadowTrails;
    private @Nullable String nameRegex;
    /**
     * @return A list of trail names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String status;
    private List<GetTrailsDeprecatedTrail> trails;

    private GetTrailsDeprecatedResult() {}
    /**
     * @return A list of actiontrails. Each element contains the following attributes:
     * 
     * @deprecated
     * Field &#39;actiontrails&#39; has been deprecated from version 1.95.0. Use &#39;trails&#39; instead.
     * 
     */
    @Deprecated /* Field 'actiontrails' has been deprecated from version 1.95.0. Use 'trails' instead. */
    public List<GetTrailsDeprecatedActiontrail> actiontrails() {
        return this.actiontrails;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<Boolean> includeOrganizationTrail() {
        return Optional.ofNullable(this.includeOrganizationTrail);
    }
    public Optional<Boolean> includeShadowTrails() {
        return Optional.ofNullable(this.includeShadowTrails);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of trail names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public List<GetTrailsDeprecatedTrail> trails() {
        return this.trails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrailsDeprecatedResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTrailsDeprecatedActiontrail> actiontrails;
        private String id;
        private List<String> ids;
        private @Nullable Boolean includeOrganizationTrail;
        private @Nullable Boolean includeShadowTrails;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        private List<GetTrailsDeprecatedTrail> trails;
        public Builder() {}
        public Builder(GetTrailsDeprecatedResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actiontrails = defaults.actiontrails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.includeOrganizationTrail = defaults.includeOrganizationTrail;
    	      this.includeShadowTrails = defaults.includeShadowTrails;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
    	      this.trails = defaults.trails;
        }

        @CustomType.Setter
        public Builder actiontrails(List<GetTrailsDeprecatedActiontrail> actiontrails) {
            this.actiontrails = Objects.requireNonNull(actiontrails);
            return this;
        }
        public Builder actiontrails(GetTrailsDeprecatedActiontrail... actiontrails) {
            return actiontrails(List.of(actiontrails));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder includeOrganizationTrail(@Nullable Boolean includeOrganizationTrail) {
            this.includeOrganizationTrail = includeOrganizationTrail;
            return this;
        }
        @CustomType.Setter
        public Builder includeShadowTrails(@Nullable Boolean includeShadowTrails) {
            this.includeShadowTrails = includeShadowTrails;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder trails(List<GetTrailsDeprecatedTrail> trails) {
            this.trails = Objects.requireNonNull(trails);
            return this;
        }
        public Builder trails(GetTrailsDeprecatedTrail... trails) {
            return trails(List.of(trails));
        }
        public GetTrailsDeprecatedResult build() {
            final var _resultValue = new GetTrailsDeprecatedResult();
            _resultValue.actiontrails = actiontrails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.includeOrganizationTrail = includeOrganizationTrail;
            _resultValue.includeShadowTrails = includeShadowTrails;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            _resultValue.trails = trails;
            return _resultValue;
        }
    }
}
