// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Inputs
{

    public sealed class HybridMonitorSlsTaskSlsProcessConfigArgs : Pulumi.ResourceArgs
    {
        [Input("expresses")]
        private InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigExpressArgs>? _expresses;

        /// <summary>
        /// The extended field that specifies the result of basic operations that are performed on aggregation results.
        /// </summary>
        public InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigExpressArgs> Expresses
        {
            get => _expresses ?? (_expresses = new InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigExpressArgs>());
            set => _expresses = value;
        }

        /// <summary>
        /// The conditions that are used to filter logs imported from Log Service. See the following `Block filter`.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.HybridMonitorSlsTaskSlsProcessConfigFilterArgs>? Filter { get; set; }

        [Input("groupBies")]
        private InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByArgs>? _groupBies;

        /// <summary>
        /// The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. See the following `Block group_by`.
        /// </summary>
        public InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByArgs> GroupBies
        {
            get => _groupBies ?? (_groupBies = new InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigGroupByArgs>());
            set => _groupBies = value;
        }

        [Input("statistics")]
        private InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticArgs>? _statistics;

        /// <summary>
        /// The method that is used to aggregate logs imported from Log Service. See the following `Block statistics`.
        /// </summary>
        public InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticArgs> Statistics
        {
            get => _statistics ?? (_statistics = new InputList<Inputs.HybridMonitorSlsTaskSlsProcessConfigStatisticArgs>());
            set => _statistics = value;
        }

        public HybridMonitorSlsTaskSlsProcessConfigArgs()
        {
        }
    }
}
