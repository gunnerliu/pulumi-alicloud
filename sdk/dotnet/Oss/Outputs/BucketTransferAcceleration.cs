// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketTransferAcceleration
    {
        /// <summary>
        /// Specifies lifecycle rule status.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private BucketTransferAcceleration(bool enabled)
        {
            Enabled = enabled;
        }
    }
}
