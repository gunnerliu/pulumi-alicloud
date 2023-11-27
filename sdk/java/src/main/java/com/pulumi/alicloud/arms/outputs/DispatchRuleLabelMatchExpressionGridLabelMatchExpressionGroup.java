// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.outputs;

import com.pulumi.alicloud.arms.outputs.DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroup {
    /**
     * @return Sets the dispatch rule. See `label_match_expressions` below.
     * 
     */
    private List<DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression> labelMatchExpressions;

    private DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroup() {}
    /**
     * @return Sets the dispatch rule. See `label_match_expressions` below.
     * 
     */
    public List<DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression> labelMatchExpressions() {
        return this.labelMatchExpressions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression> labelMatchExpressions;
        public Builder() {}
        public Builder(DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelMatchExpressions = defaults.labelMatchExpressions;
        }

        @CustomType.Setter
        public Builder labelMatchExpressions(List<DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression> labelMatchExpressions) {
            this.labelMatchExpressions = Objects.requireNonNull(labelMatchExpressions);
            return this;
        }
        public Builder labelMatchExpressions(DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroupLabelMatchExpression... labelMatchExpressions) {
            return labelMatchExpressions(List.of(labelMatchExpressions));
        }
        public DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroup build() {
            final var _resultValue = new DispatchRuleLabelMatchExpressionGridLabelMatchExpressionGroup();
            _resultValue.labelMatchExpressions = labelMatchExpressions;
            return _resultValue;
        }
    }
}
