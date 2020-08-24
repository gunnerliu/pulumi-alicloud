# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetRegistryEnterpriseSyncRulesResult',
    'AwaitableGetRegistryEnterpriseSyncRulesResult',
    'get_registry_enterprise_sync_rules',
]

@pulumi.output_type
class GetRegistryEnterpriseSyncRulesResult:
    """
    A collection of values returned by getRegistryEnterpriseSyncRules.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, name_regex=None, names=None, namespace_name=None, output_file=None, repo_name=None, rules=None, target_instance_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if namespace_name and not isinstance(namespace_name, str):
            raise TypeError("Expected argument 'namespace_name' to be a str")
        pulumi.set(__self__, "namespace_name", namespace_name)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if repo_name and not isinstance(repo_name, str):
            raise TypeError("Expected argument 'repo_name' to be a str")
        pulumi.set(__self__, "repo_name", repo_name)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if target_instance_id and not isinstance(target_instance_id, str):
            raise TypeError("Expected argument 'target_instance_id' to be a str")
        pulumi.set(__self__, "target_instance_id", target_instance_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> List[str]:
        """
        A list of matched Container Registry Enterprise Edition sync rules. Its element is a sync rule uuid.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        ID of Container Registry Enterprise Edition local instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> List[str]:
        """
        A list of sync rule names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="namespaceName")
    def namespace_name(self) -> Optional[str]:
        """
        Name of Container Registry Enterprise Edition local namespace.
        """
        return pulumi.get(self, "namespace_name")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="repoName")
    def repo_name(self) -> Optional[str]:
        """
        Name of Container Registry Enterprise Edition local repo.
        """
        return pulumi.get(self, "repo_name")

    @property
    @pulumi.getter
    def rules(self) -> List['outputs.GetRegistryEnterpriseSyncRulesRuleResult']:
        """
        A list of matched Container Registry Enterprise Edition sync rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="targetInstanceId")
    def target_instance_id(self) -> Optional[str]:
        """
        ID of Container Registry Enterprise Edition target instance.
        """
        return pulumi.get(self, "target_instance_id")


class AwaitableGetRegistryEnterpriseSyncRulesResult(GetRegistryEnterpriseSyncRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegistryEnterpriseSyncRulesResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            namespace_name=self.namespace_name,
            output_file=self.output_file,
            repo_name=self.repo_name,
            rules=self.rules,
            target_instance_id=self.target_instance_id)


def get_registry_enterprise_sync_rules(ids: Optional[List[str]] = None,
                                       instance_id: Optional[str] = None,
                                       name_regex: Optional[str] = None,
                                       namespace_name: Optional[str] = None,
                                       output_file: Optional[str] = None,
                                       repo_name: Optional[str] = None,
                                       target_instance_id: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegistryEnterpriseSyncRulesResult:
    """
    This data source provides a list Container Registry Enterprise Edition sync rules on Alibaba Cloud.

    > **NOTE:** Available in v1.90.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    my_sync_rules = alicloud.cs.get_registry_enterprise_sync_rules(instance_id="cri-xxx",
        namespace_name="test-namespace",
        repo_name="test-repo",
        target_instance_id="cri-yyy",
        name_regex="test-rule")
    pulumi.export("output", [__item.id for __item in my_sync_rules.rules])
    ```


    :param List[str] ids: A list of ids to filter results by sync rule id.
    :param str instance_id: ID of Container Registry Enterprise Edition local instance.
    :param str name_regex: A regex string to filter results by sync rule name.
    :param str namespace_name: Name of Container Registry Enterprise Edition local namespace.
    :param str repo_name: Name of Container Registry Enterprise Edition local repo.
    :param str target_instance_id: ID of Container Registry Enterprise Edition target instance.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['namespaceName'] = namespace_name
    __args__['outputFile'] = output_file
    __args__['repoName'] = repo_name
    __args__['targetInstanceId'] = target_instance_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cs/getRegistryEnterpriseSyncRules:getRegistryEnterpriseSyncRules', __args__, opts=opts, typ=GetRegistryEnterpriseSyncRulesResult).value

    return AwaitableGetRegistryEnterpriseSyncRulesResult(
        id=__ret__.id,
        ids=__ret__.ids,
        instance_id=__ret__.instance_id,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        namespace_name=__ret__.namespace_name,
        output_file=__ret__.output_file,
        repo_name=__ret__.repo_name,
        rules=__ret__.rules,
        target_instance_id=__ret__.target_instance_id)
