# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetSaslAclsResult',
    'AwaitableGetSaslAclsResult',
    'get_sasl_acls',
    'get_sasl_acls_output',
]

@pulumi.output_type
class GetSaslAclsResult:
    """
    A collection of values returned by getSaslAcls.
    """
    def __init__(__self__, acl_resource_name=None, acl_resource_type=None, acls=None, id=None, instance_id=None, output_file=None, username=None):
        if acl_resource_name and not isinstance(acl_resource_name, str):
            raise TypeError("Expected argument 'acl_resource_name' to be a str")
        pulumi.set(__self__, "acl_resource_name", acl_resource_name)
        if acl_resource_type and not isinstance(acl_resource_type, str):
            raise TypeError("Expected argument 'acl_resource_type' to be a str")
        pulumi.set(__self__, "acl_resource_type", acl_resource_type)
        if acls and not isinstance(acls, list):
            raise TypeError("Expected argument 'acls' to be a list")
        pulumi.set(__self__, "acls", acls)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="aclResourceName")
    def acl_resource_name(self) -> str:
        """
        The resource name of the sasl acl.
        """
        return pulumi.get(self, "acl_resource_name")

    @property
    @pulumi.getter(name="aclResourceType")
    def acl_resource_type(self) -> str:
        """
        The resource type of the sasl acl.
        """
        return pulumi.get(self, "acl_resource_type")

    @property
    @pulumi.getter
    def acls(self) -> Sequence['outputs.GetSaslAclsAclResult']:
        """
        A list of sasl acls. Each element contains the following attributes:
        """
        return pulumi.get(self, "acls")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        The username of the sasl acl.
        """
        return pulumi.get(self, "username")


class AwaitableGetSaslAclsResult(GetSaslAclsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSaslAclsResult(
            acl_resource_name=self.acl_resource_name,
            acl_resource_type=self.acl_resource_type,
            acls=self.acls,
            id=self.id,
            instance_id=self.instance_id,
            output_file=self.output_file,
            username=self.username)


def get_sasl_acls(acl_resource_name: Optional[str] = None,
                  acl_resource_type: Optional[str] = None,
                  instance_id: Optional[str] = None,
                  output_file: Optional[str] = None,
                  username: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSaslAclsResult:
    """
    This data source provides a list of ALIKAFKA Sasl acls in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.66.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sasl_acls_ds = alicloud.actiontrail.get_sasl_acls(acl_resource_name="testTopic",
        acl_resource_type="Topic",
        instance_id="xxx",
        output_file="saslAcls.txt",
        username="username")
    pulumi.export("firstSaslAclUsername", sasl_acls_ds.acls[0].username)
    ```


    :param str acl_resource_name: Get results for the specified resource name.
    :param str acl_resource_type: Get results for the specified resource type.
    :param str instance_id: ID of the ALIKAFKA Instance that owns the sasl acls.
    :param str username: Get results for the specified username.
    """
    __args__ = dict()
    __args__['aclResourceName'] = acl_resource_name
    __args__['aclResourceType'] = acl_resource_type
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    __args__['username'] = username
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:actiontrail/getSaslAcls:getSaslAcls', __args__, opts=opts, typ=GetSaslAclsResult).value

    return AwaitableGetSaslAclsResult(
        acl_resource_name=__ret__.acl_resource_name,
        acl_resource_type=__ret__.acl_resource_type,
        acls=__ret__.acls,
        id=__ret__.id,
        instance_id=__ret__.instance_id,
        output_file=__ret__.output_file,
        username=__ret__.username)


@_utilities.lift_output_func(get_sasl_acls)
def get_sasl_acls_output(acl_resource_name: Optional[pulumi.Input[str]] = None,
                         acl_resource_type: Optional[pulumi.Input[str]] = None,
                         instance_id: Optional[pulumi.Input[str]] = None,
                         output_file: Optional[pulumi.Input[Optional[str]]] = None,
                         username: Optional[pulumi.Input[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSaslAclsResult]:
    """
    This data source provides a list of ALIKAFKA Sasl acls in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.66.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    sasl_acls_ds = alicloud.actiontrail.get_sasl_acls(acl_resource_name="testTopic",
        acl_resource_type="Topic",
        instance_id="xxx",
        output_file="saslAcls.txt",
        username="username")
    pulumi.export("firstSaslAclUsername", sasl_acls_ds.acls[0].username)
    ```


    :param str acl_resource_name: Get results for the specified resource name.
    :param str acl_resource_type: Get results for the specified resource type.
    :param str instance_id: ID of the ALIKAFKA Instance that owns the sasl acls.
    :param str username: Get results for the specified username.
    """
    ...
