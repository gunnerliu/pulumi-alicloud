// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.EventBridge.Outputs
{

    [OutputType]
    public sealed class GetEventBusesBusResult
    {
        public readonly string CreateTime;
        public readonly string Description;
        public readonly string EventBusName;
        public readonly string Id;

        [OutputConstructor]
        private GetEventBusesBusResult(
            string createTime,

            string description,

            string eventBusName,

            string id)
        {
            CreateTime = createTime;
            Description = description;
            EventBusName = eventBusName;
            Id = id;
        }
    }
}
