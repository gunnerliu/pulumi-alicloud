// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    /// <summary>
    /// Provides a DNS Access Strategy resource.
    /// 
    /// For information about DNS Access Strategy and how to use it, see [What is Access Strategy](https://www.alibabacloud.com/help/doc-detail/189620.html).
    /// 
    /// &gt; **NOTE:** Available in v1.152.0+.
    /// 
    /// ## Import
    /// 
    /// DNS Access Strategy can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:dns/accessStrategy:AccessStrategy example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dns/accessStrategy:AccessStrategy")]
    public partial class AccessStrategy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The primary/secondary switchover policy for address pool groups. Valid values: `AUTO`, `DEFAULT`, `FAILOVER`.
        /// </summary>
        [Output("accessMode")]
        public Output<string> AccessMode { get; private set; } = null!;

        /// <summary>
        /// The type of the primary address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        /// </summary>
        [Output("defaultAddrPoolType")]
        public Output<string> DefaultAddrPoolType { get; private set; } = null!;

        /// <summary>
        /// List of primary address pool collections. See the following `Block default_addr_pools`.
        /// </summary>
        [Output("defaultAddrPools")]
        public Output<ImmutableArray<Outputs.AccessStrategyDefaultAddrPool>> DefaultAddrPools { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable scheduling optimization for latency resolution for the primary address pool group. Valid values: `OPEN`, `CLOSE`.
        /// </summary>
        [Output("defaultLatencyOptimization")]
        public Output<string?> DefaultLatencyOptimization { get; private set; } = null!;

        /// <summary>
        /// The load balancing policy of the primary address pool group. Valid values: `ALL_RR`, `RATIO`. **NOTE:** The `default_lba_strategy` is required under the condition that `strategy_mode` is `GEO`.
        /// </summary>
        [Output("defaultLbaStrategy")]
        public Output<string?> DefaultLbaStrategy { get; private set; } = null!;

        /// <summary>
        /// The maximum number of addresses returned by the primary address pool set. **NOTE:** The `default_max_return_addr_num` is required under the condition that `strategy_mode` is `LATENCY`.
        /// </summary>
        [Output("defaultMaxReturnAddrNum")]
        public Output<int?> DefaultMaxReturnAddrNum { get; private set; } = null!;

        /// <summary>
        /// The minimum number of available addresses for the primary address pool set.
        /// </summary>
        [Output("defaultMinAvailableAddrNum")]
        public Output<int> DefaultMinAvailableAddrNum { get; private set; } = null!;

        /// <summary>
        /// The type of the secondary address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        /// </summary>
        [Output("failoverAddrPoolType")]
        public Output<string?> FailoverAddrPoolType { get; private set; } = null!;

        /// <summary>
        /// List of backup address pool sets. See the following `Block failover_addr_pools`.
        /// </summary>
        [Output("failoverAddrPools")]
        public Output<ImmutableArray<Outputs.AccessStrategyFailoverAddrPool>> FailoverAddrPools { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable scheduling optimization for latency resolution for the secondary address pool group. Valid values: `OPEN`, `CLOSE`.
        /// </summary>
        [Output("failoverLatencyOptimization")]
        public Output<string?> FailoverLatencyOptimization { get; private set; } = null!;

        /// <summary>
        /// The load balancing policy of the secondary address pool group. Valid values: `ALL_RR`, `RATIO`.
        /// </summary>
        [Output("failoverLbaStrategy")]
        public Output<string?> FailoverLbaStrategy { get; private set; } = null!;

        /// <summary>
        /// The maximum number of returned addresses in the standby address pool.
        /// </summary>
        [Output("failoverMaxReturnAddrNum")]
        public Output<int?> FailoverMaxReturnAddrNum { get; private set; } = null!;

        /// <summary>
        /// The minimum number of available addresses in the standby address pool.
        /// </summary>
        [Output("failoverMinAvailableAddrNum")]
        public Output<int?> FailoverMinAvailableAddrNum { get; private set; } = null!;

        /// <summary>
        /// The Id of the associated instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The lang.
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// The source regions. See the following `Block lines`. **NOTE:** The `lines` is required under the condition that `strategy_mode` is `GEO`.
        /// </summary>
        [Output("lines")]
        public Output<ImmutableArray<Outputs.AccessStrategyLine>> Lines { get; private set; } = null!;

        /// <summary>
        /// The type of the access policy. Valid values: `GEO` or `LATENCY`. `GEO`: based on geographic location. `LATENCY`: Based on delay.
        /// </summary>
        [Output("strategyMode")]
        public Output<string> StrategyMode { get; private set; } = null!;

        /// <summary>
        /// The name of the access policy.
        /// </summary>
        [Output("strategyName")]
        public Output<string> StrategyName { get; private set; } = null!;


        /// <summary>
        /// Create a AccessStrategy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessStrategy(string name, AccessStrategyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dns/accessStrategy:AccessStrategy", name, args ?? new AccessStrategyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessStrategy(string name, Input<string> id, AccessStrategyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dns/accessStrategy:AccessStrategy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessStrategy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessStrategy Get(string name, Input<string> id, AccessStrategyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessStrategy(name, id, state, options);
        }
    }

    public sealed class AccessStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The primary/secondary switchover policy for address pool groups. Valid values: `AUTO`, `DEFAULT`, `FAILOVER`.
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        /// <summary>
        /// The type of the primary address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        /// </summary>
        [Input("defaultAddrPoolType", required: true)]
        public Input<string> DefaultAddrPoolType { get; set; } = null!;

        [Input("defaultAddrPools", required: true)]
        private InputList<Inputs.AccessStrategyDefaultAddrPoolArgs>? _defaultAddrPools;

        /// <summary>
        /// List of primary address pool collections. See the following `Block default_addr_pools`.
        /// </summary>
        public InputList<Inputs.AccessStrategyDefaultAddrPoolArgs> DefaultAddrPools
        {
            get => _defaultAddrPools ?? (_defaultAddrPools = new InputList<Inputs.AccessStrategyDefaultAddrPoolArgs>());
            set => _defaultAddrPools = value;
        }

        /// <summary>
        /// Specifies whether to enable scheduling optimization for latency resolution for the primary address pool group. Valid values: `OPEN`, `CLOSE`.
        /// </summary>
        [Input("defaultLatencyOptimization")]
        public Input<string>? DefaultLatencyOptimization { get; set; }

        /// <summary>
        /// The load balancing policy of the primary address pool group. Valid values: `ALL_RR`, `RATIO`. **NOTE:** The `default_lba_strategy` is required under the condition that `strategy_mode` is `GEO`.
        /// </summary>
        [Input("defaultLbaStrategy")]
        public Input<string>? DefaultLbaStrategy { get; set; }

        /// <summary>
        /// The maximum number of addresses returned by the primary address pool set. **NOTE:** The `default_max_return_addr_num` is required under the condition that `strategy_mode` is `LATENCY`.
        /// </summary>
        [Input("defaultMaxReturnAddrNum")]
        public Input<int>? DefaultMaxReturnAddrNum { get; set; }

        /// <summary>
        /// The minimum number of available addresses for the primary address pool set.
        /// </summary>
        [Input("defaultMinAvailableAddrNum", required: true)]
        public Input<int> DefaultMinAvailableAddrNum { get; set; } = null!;

        /// <summary>
        /// The type of the secondary address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        /// </summary>
        [Input("failoverAddrPoolType")]
        public Input<string>? FailoverAddrPoolType { get; set; }

        [Input("failoverAddrPools")]
        private InputList<Inputs.AccessStrategyFailoverAddrPoolArgs>? _failoverAddrPools;

        /// <summary>
        /// List of backup address pool sets. See the following `Block failover_addr_pools`.
        /// </summary>
        public InputList<Inputs.AccessStrategyFailoverAddrPoolArgs> FailoverAddrPools
        {
            get => _failoverAddrPools ?? (_failoverAddrPools = new InputList<Inputs.AccessStrategyFailoverAddrPoolArgs>());
            set => _failoverAddrPools = value;
        }

        /// <summary>
        /// Specifies whether to enable scheduling optimization for latency resolution for the secondary address pool group. Valid values: `OPEN`, `CLOSE`.
        /// </summary>
        [Input("failoverLatencyOptimization")]
        public Input<string>? FailoverLatencyOptimization { get; set; }

        /// <summary>
        /// The load balancing policy of the secondary address pool group. Valid values: `ALL_RR`, `RATIO`.
        /// </summary>
        [Input("failoverLbaStrategy")]
        public Input<string>? FailoverLbaStrategy { get; set; }

        /// <summary>
        /// The maximum number of returned addresses in the standby address pool.
        /// </summary>
        [Input("failoverMaxReturnAddrNum")]
        public Input<int>? FailoverMaxReturnAddrNum { get; set; }

        /// <summary>
        /// The minimum number of available addresses in the standby address pool.
        /// </summary>
        [Input("failoverMinAvailableAddrNum")]
        public Input<int>? FailoverMinAvailableAddrNum { get; set; }

        /// <summary>
        /// The Id of the associated instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        [Input("lines")]
        private InputList<Inputs.AccessStrategyLineArgs>? _lines;

        /// <summary>
        /// The source regions. See the following `Block lines`. **NOTE:** The `lines` is required under the condition that `strategy_mode` is `GEO`.
        /// </summary>
        public InputList<Inputs.AccessStrategyLineArgs> Lines
        {
            get => _lines ?? (_lines = new InputList<Inputs.AccessStrategyLineArgs>());
            set => _lines = value;
        }

        /// <summary>
        /// The type of the access policy. Valid values: `GEO` or `LATENCY`. `GEO`: based on geographic location. `LATENCY`: Based on delay.
        /// </summary>
        [Input("strategyMode", required: true)]
        public Input<string> StrategyMode { get; set; } = null!;

        /// <summary>
        /// The name of the access policy.
        /// </summary>
        [Input("strategyName", required: true)]
        public Input<string> StrategyName { get; set; } = null!;

        public AccessStrategyArgs()
        {
        }
        public static new AccessStrategyArgs Empty => new AccessStrategyArgs();
    }

    public sealed class AccessStrategyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The primary/secondary switchover policy for address pool groups. Valid values: `AUTO`, `DEFAULT`, `FAILOVER`.
        /// </summary>
        [Input("accessMode")]
        public Input<string>? AccessMode { get; set; }

        /// <summary>
        /// The type of the primary address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        /// </summary>
        [Input("defaultAddrPoolType")]
        public Input<string>? DefaultAddrPoolType { get; set; }

        [Input("defaultAddrPools")]
        private InputList<Inputs.AccessStrategyDefaultAddrPoolGetArgs>? _defaultAddrPools;

        /// <summary>
        /// List of primary address pool collections. See the following `Block default_addr_pools`.
        /// </summary>
        public InputList<Inputs.AccessStrategyDefaultAddrPoolGetArgs> DefaultAddrPools
        {
            get => _defaultAddrPools ?? (_defaultAddrPools = new InputList<Inputs.AccessStrategyDefaultAddrPoolGetArgs>());
            set => _defaultAddrPools = value;
        }

        /// <summary>
        /// Specifies whether to enable scheduling optimization for latency resolution for the primary address pool group. Valid values: `OPEN`, `CLOSE`.
        /// </summary>
        [Input("defaultLatencyOptimization")]
        public Input<string>? DefaultLatencyOptimization { get; set; }

        /// <summary>
        /// The load balancing policy of the primary address pool group. Valid values: `ALL_RR`, `RATIO`. **NOTE:** The `default_lba_strategy` is required under the condition that `strategy_mode` is `GEO`.
        /// </summary>
        [Input("defaultLbaStrategy")]
        public Input<string>? DefaultLbaStrategy { get; set; }

        /// <summary>
        /// The maximum number of addresses returned by the primary address pool set. **NOTE:** The `default_max_return_addr_num` is required under the condition that `strategy_mode` is `LATENCY`.
        /// </summary>
        [Input("defaultMaxReturnAddrNum")]
        public Input<int>? DefaultMaxReturnAddrNum { get; set; }

        /// <summary>
        /// The minimum number of available addresses for the primary address pool set.
        /// </summary>
        [Input("defaultMinAvailableAddrNum")]
        public Input<int>? DefaultMinAvailableAddrNum { get; set; }

        /// <summary>
        /// The type of the secondary address pool. Valid values: `IPV4`, `IPV6`, `DOMAIN`.
        /// </summary>
        [Input("failoverAddrPoolType")]
        public Input<string>? FailoverAddrPoolType { get; set; }

        [Input("failoverAddrPools")]
        private InputList<Inputs.AccessStrategyFailoverAddrPoolGetArgs>? _failoverAddrPools;

        /// <summary>
        /// List of backup address pool sets. See the following `Block failover_addr_pools`.
        /// </summary>
        public InputList<Inputs.AccessStrategyFailoverAddrPoolGetArgs> FailoverAddrPools
        {
            get => _failoverAddrPools ?? (_failoverAddrPools = new InputList<Inputs.AccessStrategyFailoverAddrPoolGetArgs>());
            set => _failoverAddrPools = value;
        }

        /// <summary>
        /// Specifies whether to enable scheduling optimization for latency resolution for the secondary address pool group. Valid values: `OPEN`, `CLOSE`.
        /// </summary>
        [Input("failoverLatencyOptimization")]
        public Input<string>? FailoverLatencyOptimization { get; set; }

        /// <summary>
        /// The load balancing policy of the secondary address pool group. Valid values: `ALL_RR`, `RATIO`.
        /// </summary>
        [Input("failoverLbaStrategy")]
        public Input<string>? FailoverLbaStrategy { get; set; }

        /// <summary>
        /// The maximum number of returned addresses in the standby address pool.
        /// </summary>
        [Input("failoverMaxReturnAddrNum")]
        public Input<int>? FailoverMaxReturnAddrNum { get; set; }

        /// <summary>
        /// The minimum number of available addresses in the standby address pool.
        /// </summary>
        [Input("failoverMinAvailableAddrNum")]
        public Input<int>? FailoverMinAvailableAddrNum { get; set; }

        /// <summary>
        /// The Id of the associated instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The lang.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        [Input("lines")]
        private InputList<Inputs.AccessStrategyLineGetArgs>? _lines;

        /// <summary>
        /// The source regions. See the following `Block lines`. **NOTE:** The `lines` is required under the condition that `strategy_mode` is `GEO`.
        /// </summary>
        public InputList<Inputs.AccessStrategyLineGetArgs> Lines
        {
            get => _lines ?? (_lines = new InputList<Inputs.AccessStrategyLineGetArgs>());
            set => _lines = value;
        }

        /// <summary>
        /// The type of the access policy. Valid values: `GEO` or `LATENCY`. `GEO`: based on geographic location. `LATENCY`: Based on delay.
        /// </summary>
        [Input("strategyMode")]
        public Input<string>? StrategyMode { get; set; }

        /// <summary>
        /// The name of the access policy.
        /// </summary>
        [Input("strategyName")]
        public Input<string>? StrategyName { get; set; }

        public AccessStrategyState()
        {
        }
        public static new AccessStrategyState Empty => new AccessStrategyState();
    }
}
