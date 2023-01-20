// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Gpdb.Inputs
{

    public sealed class DbInstancePlanPlanConfigResumeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The executed time of the Plan.
        /// </summary>
        [Input("executeTime")]
        public Input<string>? ExecuteTime { get; set; }

        /// <summary>
        /// The Cron Time of the plan.
        /// </summary>
        [Input("planCronTime")]
        public Input<string>? PlanCronTime { get; set; }

        public DbInstancePlanPlanConfigResumeGetArgs()
        {
        }
        public static new DbInstancePlanPlanConfigResumeGetArgs Empty => new DbInstancePlanPlanConfigResumeGetArgs();
    }
}
