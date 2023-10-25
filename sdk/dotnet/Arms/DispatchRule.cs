// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    /// <summary>
    /// Provides a Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule resource.
    /// 
    /// For information about Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule and how to use it, see [What is Alert Dispatch_Rule](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateDispatchRule).
    /// 
    /// &gt; **NOTE:** Available since v1.136.0.
    /// 
    /// ## Import
    /// 
    /// Application Real-Time Monitoring Service (ARMS) Alert Contact can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:arms/dispatchRule:DispatchRule example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/dispatchRule:DispatchRule")]
    public partial class DispatchRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the dispatch policy.
        /// </summary>
        [Output("dispatchRuleName")]
        public Output<string> DispatchRuleName { get; private set; } = null!;

        /// <summary>
        /// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        /// </summary>
        [Output("dispatchType")]
        public Output<string?> DispatchType { get; private set; } = null!;

        /// <summary>
        /// Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        /// </summary>
        [Output("groupRules")]
        public Output<ImmutableArray<Outputs.DispatchRuleGroupRule>> GroupRules { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        /// </summary>
        [Output("isRecover")]
        public Output<bool?> IsRecover { get; private set; } = null!;

        /// <summary>
        /// Sets the dispatch rule. See `label_match_expression_grid` below.
        /// </summary>
        [Output("labelMatchExpressionGrids")]
        public Output<ImmutableArray<Outputs.DispatchRuleLabelMatchExpressionGrid>> LabelMatchExpressionGrids { get; private set; } = null!;

        /// <summary>
        /// Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        /// </summary>
        [Output("notifyRules")]
        public Output<ImmutableArray<Outputs.DispatchRuleNotifyRule>> NotifyRules { get; private set; } = null!;

        /// <summary>
        /// The resource status of Alert Dispatch Rule.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a DispatchRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DispatchRule(string name, DispatchRuleArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/dispatchRule:DispatchRule", name, args ?? new DispatchRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DispatchRule(string name, Input<string> id, DispatchRuleState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/dispatchRule:DispatchRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DispatchRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DispatchRule Get(string name, Input<string> id, DispatchRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new DispatchRule(name, id, state, options);
        }
    }

    public sealed class DispatchRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the dispatch policy.
        /// </summary>
        [Input("dispatchRuleName", required: true)]
        public Input<string> DispatchRuleName { get; set; } = null!;

        /// <summary>
        /// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        /// </summary>
        [Input("dispatchType")]
        public Input<string>? DispatchType { get; set; }

        [Input("groupRules", required: true)]
        private InputList<Inputs.DispatchRuleGroupRuleArgs>? _groupRules;

        /// <summary>
        /// Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        /// </summary>
        public InputList<Inputs.DispatchRuleGroupRuleArgs> GroupRules
        {
            get => _groupRules ?? (_groupRules = new InputList<Inputs.DispatchRuleGroupRuleArgs>());
            set => _groupRules = value;
        }

        /// <summary>
        /// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        /// </summary>
        [Input("isRecover")]
        public Input<bool>? IsRecover { get; set; }

        [Input("labelMatchExpressionGrids", required: true)]
        private InputList<Inputs.DispatchRuleLabelMatchExpressionGridArgs>? _labelMatchExpressionGrids;

        /// <summary>
        /// Sets the dispatch rule. See `label_match_expression_grid` below.
        /// </summary>
        public InputList<Inputs.DispatchRuleLabelMatchExpressionGridArgs> LabelMatchExpressionGrids
        {
            get => _labelMatchExpressionGrids ?? (_labelMatchExpressionGrids = new InputList<Inputs.DispatchRuleLabelMatchExpressionGridArgs>());
            set => _labelMatchExpressionGrids = value;
        }

        [Input("notifyRules", required: true)]
        private InputList<Inputs.DispatchRuleNotifyRuleArgs>? _notifyRules;

        /// <summary>
        /// Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        /// </summary>
        public InputList<Inputs.DispatchRuleNotifyRuleArgs> NotifyRules
        {
            get => _notifyRules ?? (_notifyRules = new InputList<Inputs.DispatchRuleNotifyRuleArgs>());
            set => _notifyRules = value;
        }

        public DispatchRuleArgs()
        {
        }
        public static new DispatchRuleArgs Empty => new DispatchRuleArgs();
    }

    public sealed class DispatchRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the dispatch policy.
        /// </summary>
        [Input("dispatchRuleName")]
        public Input<string>? DispatchRuleName { get; set; }

        /// <summary>
        /// The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        /// </summary>
        [Input("dispatchType")]
        public Input<string>? DispatchType { get; set; }

        [Input("groupRules")]
        private InputList<Inputs.DispatchRuleGroupRuleGetArgs>? _groupRules;

        /// <summary>
        /// Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        /// </summary>
        public InputList<Inputs.DispatchRuleGroupRuleGetArgs> GroupRules
        {
            get => _groupRules ?? (_groupRules = new InputList<Inputs.DispatchRuleGroupRuleGetArgs>());
            set => _groupRules = value;
        }

        /// <summary>
        /// Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        /// </summary>
        [Input("isRecover")]
        public Input<bool>? IsRecover { get; set; }

        [Input("labelMatchExpressionGrids")]
        private InputList<Inputs.DispatchRuleLabelMatchExpressionGridGetArgs>? _labelMatchExpressionGrids;

        /// <summary>
        /// Sets the dispatch rule. See `label_match_expression_grid` below.
        /// </summary>
        public InputList<Inputs.DispatchRuleLabelMatchExpressionGridGetArgs> LabelMatchExpressionGrids
        {
            get => _labelMatchExpressionGrids ?? (_labelMatchExpressionGrids = new InputList<Inputs.DispatchRuleLabelMatchExpressionGridGetArgs>());
            set => _labelMatchExpressionGrids = value;
        }

        [Input("notifyRules")]
        private InputList<Inputs.DispatchRuleNotifyRuleGetArgs>? _notifyRules;

        /// <summary>
        /// Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        /// </summary>
        public InputList<Inputs.DispatchRuleNotifyRuleGetArgs> NotifyRules
        {
            get => _notifyRules ?? (_notifyRules = new InputList<Inputs.DispatchRuleNotifyRuleGetArgs>());
            set => _notifyRules = value;
        }

        /// <summary>
        /// The resource status of Alert Dispatch Rule.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public DispatchRuleState()
        {
        }
        public static new DispatchRuleState Empty => new DispatchRuleState();
    }
}
