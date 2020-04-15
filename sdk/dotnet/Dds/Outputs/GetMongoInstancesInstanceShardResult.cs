// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dds.Outputs
{

    [OutputType]
    public sealed class GetMongoInstancesInstanceShardResult
    {
        public readonly string Class;
        public readonly string Description;
        public readonly string NodeId;
        public readonly int Storage;

        [OutputConstructor]
        private GetMongoInstancesInstanceShardResult(
            string @class,

            string description,

            string nodeId,

            int storage)
        {
            Class = @class;
            Description = description;
            NodeId = nodeId;
            Storage = storage;
        }
    }
}
